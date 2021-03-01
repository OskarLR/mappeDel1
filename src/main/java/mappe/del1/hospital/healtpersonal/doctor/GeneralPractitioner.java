package mappe.del1.hospital.healtpersonal.doctor;

import mappe.del1.hospital.Patient;
import mappe.del1.hospital.healtpersonal.doctor.Doctor;

/**
 * Class GeneralPractitioner
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class GeneralPractitioner extends Doctor {

    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiganosis(diagnosis);
    }
}
