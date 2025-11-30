package com.noah.files;

public class Main {
    public static void main(String[] args) {
        FileReadAndWrite f = new FileReadAndWrite();
        f.tryCatch();

        f.printFileStatus();

        f.writeUsingBufferedWriter();
        f.readUsingBufferedReader();

        f.printShrekWhatCount();
    }
}
