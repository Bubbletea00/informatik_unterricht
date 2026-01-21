package com.noah.tree.binbaum;

public class Abschluss extends Baumelement {


    @Override
    public Knoten sortiertEinfuegen(Datenelement daten) {
        return new Knoten(daten, this, new Abschluss());
    }

    @Override
    public void suchen() {

    }

    @Override
    public Baumelement getLinkerKnoten() {
        return this;
    }

    @Override
    public Baumelement getRechterKnoten() {
        return this;
    }

    @Override
    public void preorderAusgeben() {
    }

    @Override
    public void inorderAusgeben() {

    }

    @Override
    public void postorderAusgeben() {

    }

    @Override
    public Datenelement suchen(String suchSchluessel) {
        System.out.println("Nicht gefunden: " + suchSchluessel);
        return null;
    }
}
