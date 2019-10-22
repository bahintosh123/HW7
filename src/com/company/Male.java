package com.company;

public class Male extends Human {


    @Override
    public void walk() {
        System.out.println("Sam walks");
    }

    @Override
    public void run() {
        System.out.println("Sam runs");
    }

    @Override
    public void say1() {
        System.out.println("Good day for jogging");


    }


    @Override
    public void say2() {
        System.out.println("and also it is nice weather to go for a walk");

    }
}
