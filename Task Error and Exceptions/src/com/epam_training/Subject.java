package com.epam_training;

import java.util.HashMap;
import java.util.List;

public enum Subject {
    MATH, HISTORY, BIOLOGY, PHYSICS, CHEMISTRY, TECHNICAL_DRAWING, LANGUAGE, ETHICS, POLITICAL_SCIENCE, MECHANICS, INFORMATICS;

    private List<Subject> subject;

    public List<Subject> getSubjects() {
        return subject;
    }

//    public static void main(String[] args) {
//        HashMap<Subject, Integer> marks = new HashMap<>();
//        marks.put(MATH, 8);
//    }
}
