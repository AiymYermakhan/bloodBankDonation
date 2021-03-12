package com.company.Model;

public class Receptionist {
    private int employeeId;
    private String employeeName;
    private String password;

    public Receptionist() {
    }

    public Receptionist(int employeeId, String employeeName, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
