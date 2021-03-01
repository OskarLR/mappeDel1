package mappe.del1.hospital;

import mappe.del1.hospital.Diagnosable;
import mappe.del1.hospital.Person;

/**
 *
 */
public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";

    protected Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    protected String getDiagnosis(){
        return diagnosis;
    }

    @Override
    public void setDiganosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }

}
