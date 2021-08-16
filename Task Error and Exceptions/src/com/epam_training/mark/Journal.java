package com.epam_training.mark;

import com.epam_training.exceptions.NoMarksException;
import com.epam_training.persons.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Journal {
    private Map<Integer, List<Mark>> journal;

    public Journal() {
        journal = new HashMap<>();
    }

    public void setMark(Student student, Subject subject, int mark) {
        journal.get(student.getId()).add(new Mark(subject, mark));
    }


    public List<Mark> getStudentMarks(Student student){
        return journal.getOrDefault(student.getId(), new ArrayList<>());
    }

    //Посчитать средний балл по всем предметам студента
    public double getAverageCount(Student student) throws NoMarksException {
        List<Mark> marks = getStudentMarks(student);
        if (marks.isEmpty()) {
            throw new NoMarksException("This student haven't any marks!");
        }

        int countOfMarks = marks.size();
        if (countOfMarks == 0) {
            throw new NoMarksException("This student haven't any marks!");
        }
        int summ = 0;
        for (Mark mark : marks) {
            summ += mark.getMark();
        }
        return ((double) summ) / countOfMarks;
    }


    //Посчитать средний балл по конкретному предмету в конкретной группе
    public double getAverageCountBySubjectAndStudentsInGroup(Subject subject, List<Student> studentsFromUniversity)
            throws NoMarksException {
        int summ = 0;
        int count = 0;
        for (Student student : studentsFromUniversity) {
            for (Mark mark : getStudentMarks(student)) {
                if (subject.equals(mark.getSubject())) {

                    summ += mark.getMark();
                    count++;
                }
            }
        }
        if (count == 0) {
            throw new NoMarksException("This group or faculty haven't any students");
        }
        return ((double) summ) / count;
    }

    //Посчитать средний балл по предмету для всего университета
    public double getAverageCountBySubjectInUniversity(Subject subject)
            throws NoMarksException {
        int countOfMarks = 0;
        int summ = 0;
        for (List<Mark> marks : journal.values()) {
            for (Mark mark : marks) {
                if (subject.equals(mark.getSubject())) {
                    summ += mark.getMark();
                    countOfMarks += 1;
                }
            }
        }
        if (countOfMarks == 0) {
            throw new NoMarksException("No marks!");
        }
        return ((double) summ) / countOfMarks;
    }

    public void addStudent(Student a) {
        journal.put(a.getId(), new ArrayList<>());
    }
}