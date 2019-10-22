package com.company;

public class Female extends Human {
    @Override
    public void walk() {
        System.out.println("Lilly walks");

    }

    @Override
    public void run() {
        System.out.println("Lilly runs");

    }

    @Override
    public void say1(){
        System.out.println("What can i cook");
    }

    @Override
    public void say2() {
        System.out.println("after the male will come");

    }
}
