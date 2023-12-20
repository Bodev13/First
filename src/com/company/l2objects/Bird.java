package com.company.l2objects;

public class Bird extends Animal{

    @Override
    public void eat(Eatable food) {
        System.out.println("птичка склевала " + food.getName());
    }
}
