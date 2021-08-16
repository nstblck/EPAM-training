package com.epam_training.persons;

import com.epam_training.faculties.Faculty;
import com.epam_training.groups.Group;

public class Student extends Person {
    private int id;
    private static int iD;
    private Faculty faculty;
    private Group group;
    //private List<String> subjects;

    public Student(String name, Faculty faculty, Group group) {
        this();
        this.name = name;
        this.faculty = faculty;
        this.group = group;
    }

    public Student() {
        id = iD++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return getId() + "Студент" + getName() + ", факультет " + getFaculty() + ", группа " + getGroup();
    }
}
