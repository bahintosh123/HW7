package com.company;

public abstract class Human {
    private String name;
    private String hairColor;
    private String skinColor;

    public abstract void walk();
    public abstract void run();




    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say1();
    public abstract void say2();


}
