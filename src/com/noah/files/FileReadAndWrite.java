package com.noah.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//Aufgabe 1: Füge unter try{} Code hinzu, der einen Fehler verursacht.

//Aufgabe 2: Erstelle die Methode printShrekWhatCount() und gib die summe an Zeilen aus,
//           in welchen ein "what?" vorkommt.

//Aufgabe 3* (für schnelle): Erstelle einen Konstruktor, getter und setter für die Klasse,
//                           damit du sie sinnvoll für dich nutzen kannst.


public class FileReadAndWrite {
    private String path = "res/test.txt";
    private String content = "Hello World\r\nLorem\r\nIpsum";

    private File file = new File(path);


    public void tryCatch() {
        try {
            //Füge hier deinen fehlerhaften Code ein (Aufgabe 1)
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }

    public void printFileStatus() {
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }

    public void writeUsingBufferedWriter() {

        // try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("error with the BufferedWriter");
        }
    }

    //Aufgabe 3*: Hier muss noch ein return String implementiert werden.
    public void readUsingBufferedReader() {
        String text = "";
//        StringBuilder sb = new StringBuilder();

        // try-with-resources
        try (BufferedReader b = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = b.readLine()) != null) {
                text = text + System.lineSeparator() + line;
//                sb.append(line).append(System.lineSeparator());
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("error with the BufferedReader");
        }

        System.out.println(text);
//        System.out.println(sb.toString());
    }

    /**
     * Diese Methode soll die Anzahl der Zeilen ausgeben,
     * in welchen ein "What?" im Script von Shrek vorkommt.
     */
    public void printShrekWhatCount() {
        String shrekScriptPath = "res/shrek_script.txt";
        int count = 0;

        try (BufferedReader b = new BufferedReader(new FileReader(shrekScriptPath))) {
            String line;
            while ((line = b.readLine()) != null) {
                String lowerCaseLine = line.toLowerCase();

                if (searchLine("what?", lowerCaseLine)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("error with the BufferedReader");
        }

        System.out.println("Es gibt " + count + " Zeilen, in denen What? vorkommt.");
    }

    /**
     * Diese Methode gibt 'true' zurück, wenn searchString in der line vorkommt.
     */
    private boolean searchLine(String searchString, String line) {
        return line.contains(searchString);
    }
}
