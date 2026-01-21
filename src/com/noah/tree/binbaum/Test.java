package com.noah.tree.binbaum;

public class Test {
    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        BinBaum b = new BinBaum();

        Datenelement ene = new Datenelement("ene");
        Datenelement mene = new Datenelement("mene");
        Datenelement miste = new Datenelement("miste");
        Datenelement es = new Datenelement("es");
        Datenelement rappelt = new Datenelement("rappelt");
        Datenelement in = new Datenelement("in");
        Datenelement der = new Datenelement("der");
        Datenelement kiste = new Datenelement("kiste");

        b.einfuegen(ene);
        b.einfuegen(mene);
        b.einfuegen(miste);
        b.einfuegen(es);
        b.einfuegen(rappelt);
        b.einfuegen(in);
        b.einfuegen(der);
        b.einfuegen(kiste);
        b.einfuegen(miste);

        b.suchen("ene");
        b.suchen("mene");
        b.suchen("miste");
        b.suchen("es");
        b.suchen("Hurz");

         System.out.println();
         System.out.println("Preorder-Ausgabe");
         b.preorderAusgeben();

         System.out.println();
         System.out.println("Inorder-Ausgabe");
         b.inorderAusgeben();

         System.out.println();
         System.out.println("Postorder-Ausgabe");
         b.postorderAusgeben();

    }

}
