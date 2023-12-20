package com.company.l5calc.views;

import com.company.l5calc.model.View;

import java.util.Scanner;

public class ConsoleView implements View {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public int getInt() {
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    @Override
    public void print(int res) {
        System.out.println("Результат = " + res);
    }
}
