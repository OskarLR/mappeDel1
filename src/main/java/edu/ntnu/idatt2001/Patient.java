package edu.ntnu.idatt2001;

public class Patient extends Person implements Diagnosable{

    private String diagnosis = "";

    protected Patient(String firstName, String lastName, String socialSecurityNumber, String diagnosis) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = diagnosis;
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
