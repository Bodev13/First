package com.company.l2objects;

public class HelperDog extends Dog{


    HelperDog(String name, int age) {
        super(name, age);
    }

    HelperDog(String name){
        super(name);
    }

    public String toString(){
        String s = super.toString();
        return "Helper" + s;
    }

    public void help(){
        System.out.println("i help");
    }

    @Override
    public void eat(Eatable food){
        System.out.println(getName() + " ест половину " + food.getName() + " делится с птичками ");
    }



}
