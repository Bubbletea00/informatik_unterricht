package com.noah.tree.binbaum;

public class BinBaum {
    Baumelement wurzel;

    public BinBaum(Baumelement wurzel){
        this.wurzel = wurzel;
    }

    public BinBaum(){
        wurzel = new Abschluss();
    }

    public void setWurzel(Baumelement wurzel){
        this.wurzel = wurzel;
    }

    public Baumelement getWurzel(){
        return wurzel;
    }

    public void einfuegen(Datenelement daten){
        wurzel = wurzel.sortiertEinfuegen(daten);
    }

    public Datenelement suchen(String suchSchluessel){
        return wurzel.suchen(suchSchluessel);
    }

    public void preorderAusgeben(){
        wurzel.preorderAusgeben();
    }

    public void inorderAusgeben(){
        wurzel.inorderAusgeben();
    }

    public void postorderAusgeben(){
        wurzel.postorderAusgeben();
    }

}
