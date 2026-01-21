package com.noah.tree.binbaum;

public class Knoten extends Baumelement {
    Baumelement linkerKnoten;
    Baumelement rechterKnoten;

    Datenelement daten;

    public Knoten(Datenelement daten, Baumelement linkerKnoten, Baumelement rechterKnoten) {
        this.daten = daten;
        this.linkerKnoten = linkerKnoten;
        this.rechterKnoten = rechterKnoten;
    }

    public Knoten(Datenelement daten) {
        this.daten = daten;
        linkerKnoten = new Abschluss();
        rechterKnoten = new Abschluss();
    }

    public Baumelement getRechterKnoten() {
        return rechterKnoten;
    }

    public void setRechterKnoten(Baumelement rechterKnoten) {
        this.rechterKnoten = rechterKnoten;
    }

    public Baumelement getLinkerKnoten() {
        return linkerKnoten;
    }

    public void setLinkerKnoten(Baumelement linkerKnoten) {
        this.linkerKnoten = linkerKnoten;
    }

    public Datenelement getDaten() {
        return daten;
    }

    public void setDaten(Datenelement daten) {
        this.daten = daten;
    }

    public Datenelement suchen(String suchSchluessel){
        if (daten.istGleich(suchSchluessel)){
            System.out.println("Gefunden!");
            return daten;
        } else if (daten.istKleinerAls(suchSchluessel)) {
            return rechterKnoten.suchen(suchSchluessel);
        } else {
            return linkerKnoten.suchen(suchSchluessel);
        }
    }

    @Override
    public Knoten sortiertEinfuegen(Datenelement daten) {
        if (daten.istKleinerAls(this.daten)) { 
            linkerKnoten = linkerKnoten.sortiertEinfuegen(daten);
        } else if (this.daten.istKleinerAls(daten)) { 
            rechterKnoten = rechterKnoten.sortiertEinfuegen(daten);
        } else {
            System.out.println("Gleiches Datenelement vorhanden");
        }
        return this;
    }

    @Override
    public void suchen() {

    }



    @Override
    public void preorderAusgeben() {
        daten.datenAusgeben();
        linkerKnoten.preorderAusgeben();
        rechterKnoten.preorderAusgeben();
    }

    @Override
    public void inorderAusgeben() {
        linkerKnoten.inorderAusgeben();
        daten.datenAusgeben();
        rechterKnoten.inorderAusgeben();
    }

    @Override
    public void postorderAusgeben() {
        linkerKnoten.postorderAusgeben();
        rechterKnoten.postorderAusgeben();
        daten.datenAusgeben();
    }
}
