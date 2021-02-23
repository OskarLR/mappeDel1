package edu.ntnu.idatt2001;

public class Nurse extends Employee{

    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Nurse{}";
    }
}
