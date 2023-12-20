package com.company.l1basic;

public enum Colour {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");

    private String code;

    Colour(String code) {
        this.code = code;
    }


    public String getCode() {
        return code;
    }
}
