package com.company;

public class Magican extends Role {
    public void fight()
    {
        System.out.println("魔法攻擊");
    }
    public void cure()
    {
        System.out.println("回復魔法");
    }

    @Override//重新定義
    public String toString () {
        return "法師"+super.toString();
    }
}
