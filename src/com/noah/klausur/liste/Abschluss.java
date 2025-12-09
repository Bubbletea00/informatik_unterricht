package com.noah.klausur.liste;

public class Abschluss extends Listenelement{


    @Override
    public int laengeGeben() {
        return 0;
    }

    @Override
    public void alleDatenAusgeben() {

    }

    @Override
    public Knoten hintenEinfuegen(Patient p) {
        return new Knoten(p, this);
    }

    @Override
    public Patient datenGeben() {
        return null;
    }

    @Override
    public Listenelement nachfolgerGeben() {
        return this;
    }

    @Override
    public Listenelement letztenEntfernen() {
        return this;
    }
}
