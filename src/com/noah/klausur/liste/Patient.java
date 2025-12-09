package com.noah.klausur.liste;

public class Patient {
    String name;
    int alter;

    public Patient(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public void datenAusgeben(){
        System.out.println("Name: " + name + " Alter: " + alter);
    }
}
