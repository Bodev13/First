package com.company.l1basic;

public class Book {
    String name;
    String colour;
    int pages;
    Type type;

    public Book(String name, String colour, int pages, Type type) {
        this.name = name;
        this.colour = colour;
        this.pages = pages;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    // BOOK1, BOOK2, BOOK3
}
