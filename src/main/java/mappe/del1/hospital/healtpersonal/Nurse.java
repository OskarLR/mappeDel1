package mappe.del1.hospital.healtpersonal;

import mappe.del1.hospital.healtpersonal.Employee;

/**
 * Class Nurse
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Nurse extends Employee {

    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Nurse{}";
    }
}
