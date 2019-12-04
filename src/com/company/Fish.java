package com.company;

public class Fish implements AnimalTransport {
    @Override
    public void say() {
        System.out.println("Bul-Bul");

    }

    @Override
    public void canSwim() {
        System.out.println("Fish can swim");

    }

    @Override
    public void canRun() {
        System.out.println("Fish can't even walk");

    }

    @Override
    public void canFly() {
        System.out.println("Fish can't fly");

    }
}
