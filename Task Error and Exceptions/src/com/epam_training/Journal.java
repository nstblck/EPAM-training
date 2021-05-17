package com.epam_training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Journal {
    private static HashMap<Student, HashMap<Subject, Integer>> journal = new HashMap<Student, HashMap<Subject, Integer>>(); // "Student" -> "Subject", mark[]

    private HashMap<Subject, Integer> journalContainer = new HashMap<Subject, Integer>();
    private ArrayList<Integer> marks = new ArrayList<>();

    public void addMark(Student student, Subject subject, int mark) {
        marks.add(mark);
        journalContainer.put(subject, mark);
        journal.put(student, journalContainer);
    }

    public static void outputMarks() {
        for (Map.Entry<Student, HashMap<Subject, Integer>> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}