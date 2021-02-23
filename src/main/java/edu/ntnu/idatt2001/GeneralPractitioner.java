package edu.ntnu.idatt2001;

public class GeneralPractitioner extends Doctor{

    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiganosis(diagnosis);
    }
}
