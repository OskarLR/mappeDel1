package mappe.del1.hospital.healtpersonal;

import mappe.del1.hospital.Person;

public class Employee extends Person {

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
