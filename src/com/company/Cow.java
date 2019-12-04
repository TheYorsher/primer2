package com.company;

public class Cow implements AnimalTransport {
    @Override
    public void say() {
        System.out.println("Mu-Mu");
    }

    @Override
    public void canSwim() {
        System.out.println("Cow can swim");

    }

    @Override
    public void canRun() {
        System.out.println("Cow can run");


    }

    @Override
    public void canFly() {
        System.out.println("Cow cant fly");

    }
}
