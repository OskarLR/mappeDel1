package edu.ntnu.idatt2001;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<Employee>();
        this.patients = new ArrayList<Patient>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee employee){
        boolean wasAdded = false;
        if(!this.employees.contains(employee)){
            this.employees.add(employee);
            wasAdded = true;
        }
        return wasAdded;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public boolean addPatient(Patient patient){
        boolean wasAdded = false;
        if(!this.patients.contains(patient)){
            this.patients.add(patient);
            wasAdded = true;
        }
        return wasAdded;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
