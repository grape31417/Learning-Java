package com.company;

public class  Swordman extends Role {
    public void fight(){
        System.out.println("揮劍攻擊");
    }

    @Override//重新定義
    public String toString () {
        return "劍士"+super.toString();
    }

}
