package com.company;

public class Main {

    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            for (int i = 2; i < 10; i++)
                System.out.printf("%d*%d=%2d ", i, j, i * j);//%2d向右對齊
            System.out.println();

        }
    }
}
