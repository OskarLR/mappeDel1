package mappe.del1.hospital;

import mappe.del1.hospital.healtpersonal.doctor.Doctor;

/**
 * Class Surgeon
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Surgeon extends Doctor {

    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Overidden from the Doctor class
     * @param patient
     * @param diagnosis
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiganosis(diagnosis);
    }
}
