package com.epam_training.mark;

import com.epam_training.persons.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Journal {
    private HashMap<Integer, ArrayList<Mark>> journal;

    public Journal() {
        journal = new HashMap<>();
    }


    public void setMark(Student student, Subject subject, int mark) throws IllegalArgumentException {
        journal.get(student.getId()).add(new Mark(subject, mark));
    }


    //Посчитать средний балл по всем предметам студента
    public Double getAverageCount(Student student){
        int countOfMarks = journal.get(student).size();
        if (countOfMarks == 0) {
            throw new IllegalArgumentException("This student haven't any subject!");
        }
        int summ = 0;
        for (Integer mark : journal.get(student).values()) {
            summ += mark;
        }
        return ((double) summ) / countOfMarks;
    }

    //Посчитать средний балл по конкретному предмету в конкретной группе
    public Double getAverageCount(Subject subject, ArrayList<Student> studentsFromUniversity){
        int countOfMarks = studentsFromUniversity.size();
        if (countOfMarks == 0) {
            throw new ArithmeticException("This group or faculty haven't any students");
        }
        int summ = 0;
        for (Student student : studentsFromUniversity) {
            int mark = journal.get(student).get(subject);
            summ += mark;
        }
        return ((double) summ) / countOfMarks;
    }

    //Посчитать средний балл по предмету для всего университета
    public Double getAverageCount(Subject subject) {
        int countOfMarks = 0;
        int summ = 0;
        for (HashMap<Subject, Integer> j : journal.values()) {
            if (j.containsKey(subject)) {
                countOfMarks++;
                summ += j.get(subject);
            }
        }
        if (countOfMarks == 0) {
            throw new ArithmeticException("No any faculties in the university");
        }
        return ((double) summ) / countOfMarks;
    }

    public void addStudent(Student a) {
        journal.put(a.getId(), new HashMap<>());
    }
}