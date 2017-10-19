package com.company;


public class Main {

    public static void main(String[] args) {
    Swordman swordman =new Swordman();
    swordman.setName("Justin");
    swordman.setBlood(100);
    swordman.setLevel(1);

    Magican magican =new Magican();
    magican.setName("Monica");
    magican.setBlood(100);
    magican.setLevel(1);

    /*Role role =new Role();
    role.setName("Mike");
    role.setBlood(50);
    role.setLevel(1);*///Role已設為抽象方法 無法創造物件

    showBlood(swordman);
    showBlood(magican);

    System.out.printf("%s",swordman.toString());//建立toStream簡化
    System.out.printf("%s",magican.toString());

    drawFight(swordman);
    drawFight(magican);


    }
    static void showBlood(Role role)//多型寫法 使用Role類別操控Swordman和Magican子類別(一種類別 操控多種類別)
    {
        System.out.printf("%s HP=%d%n",role.getName(),role.getBlood());
    }
    static void drawFight (Role role)
    {
        System.out.printf("%S ",role.getName());
        role.fight();
    }
}
