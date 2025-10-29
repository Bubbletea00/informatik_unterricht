package com.noah.list;

public class Patient {
    public Patient(Patient data, ListElement follower) {
        super();
    }

    String name;

    public boolean isEqual(String name){
        return name.equals(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
