package com.company.l3company;

public class Controller {
    public static void main(String[] args) {
        ICompany company = new SimpleCompany();

        Employee e1 = new Employee(1, "A", "dep1", 30000);
        Employee e2 = new Employee(2, "B", "dep1", 20000);
        Employee e3 = new Employee(3, "C", "dep2", 34000);
        Employee e4 = new Employee(4, "D", "dep3", 645000);


        //всё что печатается в консоль должно быть true
        System.out.println(company.size() == 0);
        System.out.println(company.hire(e1));
        System.out.println(company.size() == 1);
        System.out.println(!company.hire(e1));
        System.out.println(company.size() == 1);

        System.out.println(company.hire(e3));
        System.out.println(company.hire(e4));
        System.out.println(company.size() == 3);

        System.out.println(company.contains(1));
        System.out.println(company.contains(3));
        System.out.println(company.contains(4));
        System.out.println(!company.contains(2));

        System.out.println(company.fire(2) == null);

        System.out.println(e1.equals(company.fire(1)));


    }
}
