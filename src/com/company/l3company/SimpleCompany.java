package com.company.l3company;

public class SimpleCompany implements ICompany{

    private Employee[] employees = new Employee[0];

    @Override
    public boolean hire(Employee employee) {
        if(contains(employee.getId())){
            return false;
        }

        Employee[] newEmployees = new Employee[employees.length+1];

        for(int i = 0; i < employees.length; i++){
            newEmployees[i] = employees[i];
        }
        newEmployees[newEmployees.length-1] = employee;

        employees = newEmployees;
        return true;
    }

    //todo ±
    @Override
    public Employee fire(int id) {

        int index = -1;
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getId() == id){
                index = i;
            }
        }
        if(index == -1){
            return null;
        }

        Employee[] newArray = new Employee[employees.length-1];

        for(int i = 0; i < index; i++){
            newArray[i] = employees[i];
        }
        for(int i = index; i < newArray.length; i++){
            newArray[i] = employees[i+1];
        }
        Employee firedEmployee = employees[index];
        employees = newArray;

        return firedEmployee;
    }

    @Override
    public boolean contains(int id) {
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getId() == id){
                return true;
            }
        }
        return false;
    }


    @Override
    public Employee getEmployee(int id) {
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return employees.length;
    }
}
