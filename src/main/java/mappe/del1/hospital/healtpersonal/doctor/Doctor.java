package mappe.del1.hospital.healtpersonal.doctor;

import mappe.del1.hospital.Patient;
import mappe.del1.hospital.healtpersonal.Employee;

public abstract class Doctor extends Employee {

    protected Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public abstract void setDiagnosis(Patient patient, String diagnosis);

}
