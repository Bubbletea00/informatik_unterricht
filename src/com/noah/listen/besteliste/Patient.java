package com.noah.listen.besteliste;

public class Patient {
    private String name;
    private int patientNumber;

    public Patient(String name, int patientNumber){
        this.name = name;
        this.patientNumber = patientNumber;
    }

    public Patient(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPatientNumber(){
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

