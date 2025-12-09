package com.noah.klausur.liste;

public abstract class Listenelement {
    public abstract int laengeGeben();
    public abstract void alleDatenAusgeben();
    public abstract Knoten hintenEinfuegen(Patient p);
    public abstract Patient datenGeben();
    public abstract Listenelement nachfolgerGeben();

    public abstract Listenelement letztenEntfernen();
}
