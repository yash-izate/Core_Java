package oops.test;

import oops.classes.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yash Izate", 22, 600000);

        emp1.setName("Sharwari Mondhe");
        emp1.setAge(22);
        emp1.setSalary(600000);
        System.out.println(emp1.showEmployeeDetails());
    }
}