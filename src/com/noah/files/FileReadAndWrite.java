package com.noah.files;

import java.io.*;

public class FileReadAndWrite {
    public static void main(String[] args) {
        FileReadAndWrite f = new FileReadAndWrite();

        f.writeUsingBufferedWriter();

        System.out.println(f.readUsingBufferedReader());

//        f.tryCatch();
    }


    private String path = "res/test.txt";
    private String content = "Hello World\r\nabc\r\nd";

    private File f = new File(path);

    public void writeUsingBufferedWriter() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));

            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readUsingBufferedReader(){
        String fileContent = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
                fileContent = line + System.getProperty("line.separator");
            }

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent;
    }

    public void tryCatch(){
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }


}
