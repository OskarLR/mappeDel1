package mappe.del1.hospital;

import mappe.del1.hospital.healtpersonal.Employee;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Department
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Department {

    private String departmentName;
    private final ArrayList<Employee> employees;
    private final ArrayList<Patient> patients;

    /**
     * Constructor for the Department class
     * Sets department name and initializes an empty ArrayList for fields employees and patients
     * @param departmentName
     */
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

    /**
     * Adds an Employee to employees list if the do not already exist in the list
     * @param employee
     * @return true if employee was added, else false
     */
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

    /**
     * Adds an Patient to patients list if the do not already exist in the list
     * @param patient
     * @return true if employee was added, else false
     */
    public boolean addPatient(Patient patient){
        boolean wasAdded = false;
        if(!this.patients.contains(patient)){
            this.patients.add(patient);
            wasAdded = true;
        }
        return wasAdded;
    }

    /**
     * Removes Person from their respective list. Throws RemoveException if the Person could not be found in the list.
     * @param person
     * @throws RemoveException
     */
    public void remove(Person person) throws RemoveException {
        if(person instanceof Patient){
            if(!patients.contains(person))throw new RemoveException("The patient did not exist in the department");
            patients.remove(person);
        }else{
            if(!employees.contains(person)) throw new RemoveException("The employee did not exist in the department");
            employees.remove(person);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName) && employees.equals(that.employees) && patients.equals(that.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employees, patients);
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
