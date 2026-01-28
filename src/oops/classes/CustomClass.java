package oops.classes;

class EmployeeList {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My Id is " + id);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        // making employee objects
        EmployeeList yash = new EmployeeList();
        EmployeeList john = new EmployeeList();

        // setting attributes
        yash.setName("Yash Izate");
        yash.setId(103);
        yash.setSalary(10000.99);

        john.setName("John Pandey");
        john.setId(105);
        john.setSalary(12000.99);

        // methods
        yash.printDetails();
        System.out.println("My salary is " + yash.getSalary());

        john.printDetails();
        System.out.println("My salary is " + john.getSalary());

    }
}