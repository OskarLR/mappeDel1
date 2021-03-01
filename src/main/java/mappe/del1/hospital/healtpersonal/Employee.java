package mappe.del1.hospital.healtpersonal;

import mappe.del1.hospital.Person;

/**
 * Class Employee
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class Employee extends Person {

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
