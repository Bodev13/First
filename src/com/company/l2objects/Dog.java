package com.company.l2objects;

public class Dog extends Animal implements Comparable<Dog>{
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        setAge(age);
    }

    Dog(String name){
        this(name, 0);
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void eat(Eatable food){
        System.out.println(name + " ест " + food.getName());
    }

    public void bark(int barkTimes){
        for(int i = 0; i < barkTimes; i++) {
            bark();
        }
    }

    public void bark(){
        if(age < 3) {
            System.out.println(name + ": Тяф!");
        }
        if(age >= 3 & age < 6){
            System.out.println(name + ": Гав!");
        }
        if(age >= 6){
            System.out.println(name + ": Вуф!");
        }
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object anotherObject){
        if(this == anotherObject) {
            return true;
        }
        if(!(anotherObject instanceof Dog)) {
            return false;
        }

        Dog anotherDog = (Dog) anotherObject;

        return this.name.equals(anotherDog.name) && this.age == anotherDog.age;
    }

    @Override
    public int compareTo(Dog o) {
        return age - o.getAge();
    }

    //научить собаку гавкать определённое количество раз.


    /*
    <мод_доступа> <тип_результата> <имя_метода> (<список_параметров>){
        <тело_метода>
    }
    <список_параметров> - последовательность пар <тип> <идентификатор> параметров через запятую.
     */
}