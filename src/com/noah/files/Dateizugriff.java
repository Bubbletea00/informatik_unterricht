package com.noah.files;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Dateizugriff {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String filePath = "res/text/test.txt";
        String LINE_SEPARATOR = System.getProperty("line.separator");

        File f = new File(filePath);
        BufferedWriter out = null;
        BufferedReader in = null;

        String dateiinhalt;

        // Schreiben in Datei

        // String dateiinhalt = "blablabla";
        if (!f.exists()) { // nur n tig, falls man Bestehendes nicht  berschreiben m chte
            dateiinhalt = "Hallo Welt," + "\r\n" + "wie geht's dir?";
        } else {
            dateiinhalt = "Ja ist den scho wieder Weihnachten??";
        }
        try {
            out = new BufferedWriter(new FileWriter(filePath));
            out.write(dateiinhalt);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.err.println("erroerroerooooo");
        }

        // Lesen aus Datei
        f = new File(filePath);
        try {
            in = new BufferedReader(new FileReader(f));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println(zeile);
                dateiinhalt = dateiinhalt + LINE_SEPARATOR + zeile;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != in) { // Dieser Fall tritt nur ein, falls in nicht instanziiert wurde.
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
