package mappe.del1.hospital;

public class HospitalClient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("St.Olavs");
        HospitalTestData.fillRegisterWithTestData(hospital);

        Department department = hospital.getDepartments().get(0);
        Person ansatt = department.getEmployees().get(0);

        try {
            department.remove(ansatt);
        } catch (RemoveException e) {
            e.printStackTrace();
        }

        Person pasient = new Patient("Ola","Halvorsen","43251");

        try {
            department.remove(pasient);
        } catch (RemoveException e) {
            System.out.println(e.getMessage());
        }
    }
}
