package com.company.exceptions;

public class Cat {
    private String name;
    private int countOfLives;

    public Cat(String name, int countOfLives) {
        this.name = name;
        this.countOfLives = countOfLives;
    }


    public void checkLives() throws CatIsDeadException {
        if(this.countOfLives == 0){
            throw new CatIsDeadException("Кот отправляется на радугу");
        }
    }
}
