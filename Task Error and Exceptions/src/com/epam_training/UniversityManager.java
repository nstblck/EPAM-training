package com.epam_training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniversityManager {
    public List<Student> getStudentsFromTheSameGroup(List<Student> studentsFromUniversity, Group group) {
        List<Student> studentsSelectionBySameGroup = new ArrayList<>();
        for (Student student : studentsFromUniversity) {
            if (student.getGroup().equals(group))
                studentsSelectionBySameGroup.add(student);
        }
        return studentsSelectionBySameGroup;
    }

//    EnumMap<Subject, Integer> marks = new EnumMap<>(Subject.class);
//        void setMarks(){
//            marks.put(Subject.BIOLOGY,8);
//        }


    public void addMark(Student student, Subject subject, int mark) {
        HashMap<Subject, ArrayList<Integer>> journalContainer = journal.get(student);
        if (journalContainer == null) {
            journalContainer = new HashMap<>();
            journal.put(student,journalContainer);
        }
        ArrayList<Integer> marks = journalContainer.get(subject);
        if (marks == null) {
            marks = new ArrayList<>();
            journalContainer.put(subject, marks);
        }
        marks.add(mark);
    }
}
