package com.company.InnerClass;

public class Main {
    public static void main(String[] args) {
        Car golf = new Car();
        Car car = new Car("Volvo", "Best", golf.new Engine("bestEngine"));
    }
}
