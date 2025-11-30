package com.noah.files;

import java.io.*;

public class FileReadAndWrite {
    public static void main(String[] args) {
        FileReadAndWrite f = new FileReadAndWrite();
        f.tryCatch();


        if (f.file.exists()) {
            System.out.println("Datei existiert bereits");
        } else {
            System.out.println("Datei wird erstellt");
        }

        f.writeUsingBufferedWriter();
        System.out.println(f.readUsingBufferedReader());


    }


    private String path = "res/test.txt";
    private String content = "Hello World\r\nabc\r\nd";

    private File file = new File(path);

    public void writeUsingBufferedWriter() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("error with the BufferedWriter");
        }
    }


    public String readUsingBufferedReader(){
        StringBuilder sb = new StringBuilder();

        // try-with-resources
        try (BufferedReader b = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = b.readLine()) != null) {
                System.out.println(line);
                sb.append(line).append(System.lineSeparator());
            }


        }catch (IOException e){
            System.err.println("error with the BufferedReader");
        }
        return sb.toString();
    }

    public void tryCatch(){
        try {
            //Füge hier deinen Code ein
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }


}
