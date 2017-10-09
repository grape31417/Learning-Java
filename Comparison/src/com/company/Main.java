package com.company;

public class Main {

    public static void main(String[] args) {
        //使用布林進行比較條件運算
        System.out.printf("10 >  5 結果 %b%n", 10 > 5);//T
        System.out.printf("10 >= 5 結果 %b%n", 10 >= 5);//T
        System.out.printf("10 <  5 結果 %b%n", 10 < 5);//F
        System.out.printf("10 <= 5 結果 %b%n", 10 <= 5);//F
        System.out.printf("10 == 5 結果 %b%n", 10 == 5);//F
        System.out.printf("10 != 5 結果 %b%n", 10 != 5);//不等於 T

        int score =60;
        System.out.printf("是否及格?:%c%n",score>=60 ? '是':'否');//條件式? 成立值: 不成立值

    }
}
