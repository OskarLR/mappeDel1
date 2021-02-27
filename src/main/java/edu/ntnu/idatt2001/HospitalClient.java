package edu.ntnu.idatt2001;

public class HospitalClient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("St.Olavs");
        HospitalTestData.fillRegisterWithTestData(hospital);

        //Fjerner ansatt som eksisterer
        Department department = hospital.getDepartments().get(0);
        Person ansatt = department.getEmployees().get(0);

        try {
            department.remove(ansatt);
        } catch (RemoveException e) {
            e.printStackTrace();
        }

        //Fjerner pasient som ikke eksisterer
        Person pasient = new Patient("Ola","Halvorsen","43251");

        try {
            department.remove(pasient);
        } catch (RemoveException e) {
            e.printStackTrace();
        }
    }
}
