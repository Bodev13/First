package com.company.l5calc.actions;

import com.company.l5calc.model.Action;

public class MultAction  implements Action {
    @Override
    public int calc(int a, int b) {
        return a*b;
    }
}
