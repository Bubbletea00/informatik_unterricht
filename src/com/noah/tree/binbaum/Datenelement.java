package com.noah.tree.binbaum;

public class Datenelement {



    private String wert;

        public int vergleichen(Datenelement d) {
            int comparison = wert.compareTo(d.wertGeben());
            if (comparison == 0) return 0; // Equal
            if (comparison < 0) return -1; // This element is smaller
            return 1;
            // This element is larger
        }

        public Datenelement(String w) {
        wert = w;
    }

    public void wertSetzen(String neuerWert){
        wert = neuerWert;
    }

    public String wertGeben(){
        return wert;
    }

    public boolean istGleich(Datenelement d){
        return wert.equals(d.wertGeben());
    }

    public boolean istKleinerAls(Datenelement d){
        return wert.compareTo(d.wertGeben()) < 0;
    }

    public boolean istGleich(String suchSchluessel){
        return wert.equals(suchSchluessel);
    }

    public boolean istKleinerAls(String suchSchluessel){
        return wert.compareTo(suchSchluessel) < 0;
    }
    public void datenAusgeben() {
        System.out.println(wert);
    }
}
