package com.epam_training;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class EnglishText {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("/Users/user/IdeaProjects/EPAM_training/Enum Extra/English.txt");
        Set<String> stringSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while ((line = bufferReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        bufferReader.close();
        stringSet.addAll(Arrays.asList(stringBuilder.toString().toLowerCase().split(" |, |. |\\.")));
        System.out.println(stringSet);
    }
}
