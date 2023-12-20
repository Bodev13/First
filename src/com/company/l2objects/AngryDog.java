package com.company.l2objects;

public class AngryDog extends Dog{
    AngryDog(String name) {
        super(name);
    }

    public void toBeMad(){
        System.out.println(getName() + ": AAAaERRRRRRRR!!");
    }

    @Override
    public void eat(Eatable food){
        System.out.println(getName() + " злобно и громко пожирает " + food.getName());
    }


    @Override
    public String toString() {
        return "Angry" + super.toString();
    }
}
