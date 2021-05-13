package com.epam_training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static File file = new File("/Users/user/IdeaProjects/EPAM_training/Enum Extra/Song.txt");
    static ArrayList<String> arrayListSong = new ArrayList<>();

    public static void main(String[] args) {
        readPoemFromFile();
        addToArrayList();
        System.out.println(arrayListSong);
        sortList();
    }


    public static void addToArrayList() {
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            do {
                line = bufferedReader.readLine();
                arrayListSong.add(bufferedReader.readLine());
            } while (line != null);
            reader.close();
            bufferedReader.close();
            for (String args : arrayListSong) {
                System.out.println(args);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readPoemFromFile() {
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            do {
                line = bufferedReader.readLine();
                System.out.println(line);
            } while (line != null);
            reader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortList() {
        Collections.sort(arrayListSong, (a, b) -> b.length() - a.length());
    }

}
