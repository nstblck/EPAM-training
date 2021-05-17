package com.epam_training;

import com.epam_training.Faculties.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	University university = new University();
	UniversityManager manager = new UniversityManager();
        HashMap<Subject, Integer> marks = new HashMap<>();
        List<Faculty> faculties = new ArrayList();
        Double average = faculties.stream().flatMap(faculty -> faculty.getGroups().stream()).flatMap(group -> group.getStudents().stream()).mapToDouble(student -> student.getMark(subject)).average().getAsDouble();
        getJournal().addMark("Иванов", Subject.MATH, 7);

    }
}
