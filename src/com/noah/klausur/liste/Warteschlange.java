package com.noah.klausur.liste;

public class Warteschlange {
    Listenelement anfang;

    public Warteschlange(){
        anfang = new Abschluss();
    }

    public void hintenEinfuegen(Patient p){
        anfang = anfang.hintenEinfuegen(p);
    }

    public void vorneEinfuegen(Patient p){
        anfang = new Knoten(p, anfang);
    }

    public void listeAusgeben(){
        if (anfang == null) {
            System.out.println("keine Patienten");
        } else {
            anfang.alleDatenAusgeben();
        }
    }

    public void gesamteLaengeAusgeben(){
        if (anfang == null) {
            System.out.println("keine Patienten");
        } else {
            System.out.println("Anzahl Patienten: " + anfang.laengeGeben());
        }
    }


    //entfernen
    public Patient vorneEntfernen() {
        Patient alterErster = anfang.datenGeben();
        anfang = anfang.nachfolgerGeben();
        return alterErster;
    }

    public Listenelement hintenEntfernen() {
        if (anfang.nachfolgerGeben() instanceof Abschluss) {
            Listenelement altesElement = anfang;
            anfang = new Abschluss();
            return altesElement;
        } else {
            return anfang.letztenEntfernen();
        }
    }
}
