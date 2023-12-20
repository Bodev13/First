package com.company.l2objects;

public class Stock {
    private int amount;

    public int getItem(int a){
        if(a > 0){
            if(amount >= a){
                this.amount = this.amount - a;
            } else {
                a = amount;
                this.amount = 0;
            }
            System.out.println("Со склада забрали " + a + " товара, осталось: " + amount);
            return a;
        }
        return 0;
    }
    public void addItem(int amount){
        if(amount > 0){
            this.amount = this.amount + amount;
            System.out.println("На склад добавили " + amount + " товара, и стало: " + this.amount);
        }
    }

    public static void main(String[] args) {

        Stock amount1 = new Stock();
        amount1.addItem(15);
        amount1.addItem(12);
        amount1.addItem(2);

        amount1.getItem(9);
        amount1.getItem(5);

        amount1.addItem(7);

        amount1.getItem(30);

    }
}



