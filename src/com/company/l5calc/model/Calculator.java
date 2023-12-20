package com.company.l5calc.model;

public class Calculator {
    private View view;
    private Action action;

    public Calculator(View view, Action action) {
        this.view = view;
        this.action = action;
    }

    public void start(){
        while(true){
            int a = view.getInt();
            int b = view.getInt();

            int res = action.calc(a, b);

            view.print(res);
        }
    }

}
