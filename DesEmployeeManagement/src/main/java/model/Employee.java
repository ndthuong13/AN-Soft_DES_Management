/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author van46
 */
public class Employee {
    private int id;
    private String fullName;
    private String position;
    private String department;
    private double salary;
    private String encryptedData;
    private String secret_key;

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    // Constructors
    public Employee() {}

    public Employee(int id, String fullName, String position, String department, double salary, String encryptedData, String secret_key) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.encryptedData = encryptedData;
        this.secret_key = secret_key;
    }

    public Employee(String fullName, String position, String department, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    // Optional: ToString for debugging
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", encryptedData='" + encryptedData + '\'' +
                '}';
    }
}
