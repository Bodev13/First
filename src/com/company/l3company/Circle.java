package com.company.l3company;

public class Circle {

    //    int centerX;
//    int centerY;
//    int radius;
//    int width;
//    int colour;
//
//    public Circle(int centerX, int centerY, int radius) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width, int colour) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//        this.colour = colour;
//    }
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.color.setDescription("Red");
//        System.out.println(circle.color.getDescription());
//    }
//
//    public Color color;
//
//
//    public void Circle() {
//        color = new Color();
//    }
//
//    public class Color {
//        String description;
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }
    public Color color;

    public Circle() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}


//}
