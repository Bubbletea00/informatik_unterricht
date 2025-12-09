package com.noah.klausur.liste;

public class Knoten extends Listenelement{
    Patient p;
    Listenelement nachfolger;


    public Knoten(Patient p, Listenelement nachfolger) {
        this.p = p;
        this.nachfolger = nachfolger;
    }

    public Patient datenGeben() {
        return p;
    }

    @Override
    public Listenelement nachfolgerGeben() {
        return nachfolger;
    }

    @Override
    public Listenelement letztenEntfernen() {
        if (nachfolger.nachfolgerGeben() instanceof Abschluss) {
            Listenelement altesElement = nachfolger;
            nachfolger = new Abschluss();
            return altesElement;
        } else {
            return nachfolger.letztenEntfernen();
        }
    }


    @Override
    public Knoten hintenEinfuegen(Patient p) {
        nachfolger = nachfolger.hintenEinfuegen(p);
        return this;
    }

    @Override
    public int laengeGeben() {
        return nachfolger.laengeGeben() + 1;
    }

    @Override
    public void alleDatenAusgeben() {
        p.datenAusgeben();
        nachfolger.alleDatenAusgeben();
    }


}
