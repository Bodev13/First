package com.company.l2objects;

public class Potato implements Eatable{

    private String name = "картошка";

    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public String getName() {
        return name;
    }
}
