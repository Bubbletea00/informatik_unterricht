package com.noah.klausur.liste;

public class Test {
    public static void main(String[] args) {
        Patient p1 = new Patient("Guenther", 12);
        Patient p2 = new Patient("Peter", 93);
        Patient p3 = new Patient("Jochen", 23);


        Warteschlange w = new Warteschlange();
        w.hintenEinfuegen(p1);
        w.hintenEinfuegen(p2);
        w.hintenEinfuegen(p3);

        w.listeAusgeben();
        w.gesamteLaengeAusgeben();
    }

}
