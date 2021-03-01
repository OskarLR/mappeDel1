package mappe.del1.hospital;

import mappe.del1.hospital.healtpersonal.Employee;

import java.util.ArrayList;
import java.util.Objects;

public class Department {

    private String departmentName;
    private final ArrayList<Employee> employees;
    private final ArrayList<Patient> patients;

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
