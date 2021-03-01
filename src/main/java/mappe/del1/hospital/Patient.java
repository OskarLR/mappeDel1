package mappe.del1.hospital;

import mappe.del1.hospital.Diagnosable;
import mappe.del1.hospital.Person;

/**
 * Class Patient
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";

    /**
     * Constructor for the Patient class
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber unique number for every patient
     */
    protected Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    protected String getDiagnosis(){
        return diagnosis;
    }

    /**
     * Set diagnosis of the Patient. Overridden from the Diagnosable interface
     * @param diagnosis
     */
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
