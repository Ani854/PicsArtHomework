package model;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 50)
            this.age = age;
        else System.out.println("Your age does not meet the requirements");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}
