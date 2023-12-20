package com.company.l5calc;

import com.company.l5calc.actions.MultAction;
import com.company.l5calc.model.Action;
import com.company.l5calc.model.Calculator;
import com.company.l5calc.model.View;
import com.company.l5calc.views.ConsoleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            int result = a * b;
//            System.out.println(result);
//            System.out.println();
//        }

        View view = new ConsoleView();
        //Action action = new AddAction();
        Action action = new MultAction();

        Calculator calculator = new Calculator(view, action);
        calculator.start();


    }

}
