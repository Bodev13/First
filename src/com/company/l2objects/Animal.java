package com.company.l2objects;

public abstract class Animal {
    private int weight;

    public abstract void eat(Eatable food);

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
