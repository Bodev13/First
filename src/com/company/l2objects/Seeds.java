package com.company.l2objects;

public class Seeds implements Eatable{

    private String name = "Зерно";

    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public String getName() {
        return name;
    }
}
