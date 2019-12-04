package com.company;

public class Test {
    public static void main(String[] args){
        AnimalTransport cow = new Cow();
        cow.say();
        cow.canSwim();
        cow.canRun();
        cow.canFly();

        AnimalTransport fish = new Fish();
        fish.say();
        fish.canSwim();
        fish.canRun();
        fish.canFly();


    }
}
