package main;

import model.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Ani");
        employee1.setLastName("Stepanyan");
        employee1.setAge(22);
        employee1.setSalary(1000);
        employee1.printEmployee();

        Employee employee2 = new Employee();
        employee2.setFirstName("Armen");
        employee2.setLastName("Melqumyan");
        employee2.setAge(17);
        System.out.println(employee2.getAge());
    }
}
