package com.company.littleSubjects;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1991, Month.APRIL, 5);
        System.out.println(birthDay);

        LocalDate localDate = birthDay.plusDays(7);

        System.out.println(localDate);

        Date then = new Date();
        System.out.println(then);

        System.out.println(then.getTime());
        List list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        System.out.println(new Date().getTime() - then.getTime());

    }
}
