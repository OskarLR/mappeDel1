package mappe.del1.hospital;

import mappe.del1.hospital.Department;

import java.util.ArrayList;

public class Hospital {

    private final String hospitalName;
    private ArrayList<Department> departments;

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
