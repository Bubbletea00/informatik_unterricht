package com.noah.tree.binbaum;

public abstract class Baumelement {
    public abstract Knoten sortiertEinfuegen(Datenelement daten);
    public abstract void suchen();

    public abstract Baumelement getLinkerKnoten();
    public abstract Baumelement getRechterKnoten();

    public abstract void preorderAusgeben();
    public abstract void inorderAusgeben();
    public abstract void postorderAusgeben();

    public abstract Datenelement suchen(String suchSchluessel);
}
