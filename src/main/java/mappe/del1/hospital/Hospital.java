package mappe.del1.hospital;

import mappe.del1.hospital.Department;

import java.util.ArrayList;

/**
 * Class Hospital
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Hospital {

    private final String hospitalName;
    private ArrayList<Department> departments;

    /**
     * Constructor for the Hospital class.
     * Sets hospitalName and initializes empty ArrayList for departments
     * @param hospitalName
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.departments = new ArrayList<Department>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Department> getDepartments(){
        return departments;
    }

    /**
     * Adds a Department to the hospitals departments list, as long as the department dos not already exist in the list
     * @param department
     * @return true if Department was added, else false
     */
    public boolean addDepartment(Department department){
        boolean wasAdded = false;
        if(!this.departments.contains(department)){
            this.departments.add(department);
            wasAdded = true;
        }
        return wasAdded;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
