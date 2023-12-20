package com.company.l3company;

public interface ICompany {
    boolean hire(Employee employee);
    Employee fire(int id);
    boolean contains(int id);
    Employee getEmployee(int id);
    int size();

}
