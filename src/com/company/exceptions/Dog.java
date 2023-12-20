package com.company.exceptions;

public class Dog {
    private String name;
    boolean isCollarOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if (isCollarOn) {
            System.out.println("Ура, мы идем гулять!");
        } else {
            throw new DogIsNotReadyException("Собака не готова гулять, на надет ошейник");
        }
    }
}
