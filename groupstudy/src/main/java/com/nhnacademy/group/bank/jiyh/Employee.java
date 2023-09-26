package com.nhnacademy.group.bank.jiyh;

public class Employee{
    private String name;
    private String employeeNumber;
    private int processCount;

    Employee(String name, String employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.processCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setProcessCount(int processCount) {
        this.processCount = processCount;
    }

    public int getProcessCount() {
        return processCount;
    }
}