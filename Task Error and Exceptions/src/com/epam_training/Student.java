package com.epam_training;

import com.epam_training.Faculties.Faculty;

import java.util.EnumMap;

public class Student extends Person {
    private Faculty faculty;
    private Group group;
    private EnumMap<Subject, Integer> marks = new EnumMap<>(Subject.class);

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public EnumMap<Subject, Integer> getMarks() {
        return marks;
    }

    public void setMarks(EnumMap<Subject, Integer> marks) {
        this.marks = marks;
    }

    public Student(String name, Faculty faculty, Group group) {
        super(name);
        this.faculty = faculty;
        this.group = group;
    }

//    public Student(String name, Faculty faculty, Group group, EnumMap<Subject, Integer> marks) {
//        super(name);
//        this.faculty = faculty;
//        this.group = group;
//        this.marks = marks;
//    }

    @Override
    public String toString() {
        return "Студент" + getName() + ", факультет " + getFaculty() + ", группа " + getGroup();
    }

}
