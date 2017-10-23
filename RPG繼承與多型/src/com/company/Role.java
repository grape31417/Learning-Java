package com.company;

public abstract class Role {
    private String name;
    private int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void fight();//重新定義 寫法 因為子類別實作方法不一樣

   /* public String toString () {
        return String.format(":%s 等級:%d 血量:%d %n", this.getName(), this.getLevel(), this.getBlood());
    }*/


}
