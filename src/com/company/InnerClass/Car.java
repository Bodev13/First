package com.company.InnerClass;

public class Car {
    private String mark;
    private String model;
    private Engine engine;

    public Car() {
    }

    public Car(String mark, String model, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public class Engine {
        private static String modelOfEngine;



        public Engine(String modelOfEngine) {
            Engine.modelOfEngine = modelOfEngine;
            System.out.println(model);
        }
    }
}
