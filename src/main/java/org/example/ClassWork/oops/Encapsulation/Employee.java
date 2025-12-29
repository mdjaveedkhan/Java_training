package org.example.ClassWork.Encapsulation;
public class Employee {
    public String name;
    private int empId;
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        privateMethod();
    }
    public void setEmpId(int id) {
        this.empId = id;
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.setEmpId(123);
        emp.displayInfo();
    }
}
