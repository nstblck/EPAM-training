package com.epam_training;


import com.epam_training.exceptions.NoAvailableStudentsException;
import com.epam_training.exceptions.NoMarksException;
import com.epam_training.faculties.Faculty;
import com.epam_training.groups.Group;
import com.epam_training.mark.Subject;
import com.epam_training.persons.Student;

public class Main {

    // University ->> Arraylist<Faculty> --> Araylist<Group> ....
    // university.getFaculty(Faculty.CONSTRUCTION).getGroup(Group.AST_071).addStudent("Иванов");
    // university.getFaculty(Faculty.CONSTRUCTION).getAverageMark();

    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student("Иванов", Faculty.CONSTRUCTION, Group.AST_071));
        university.addStudent(new Student("Ахметова", Faculty.CONSTRUCTION, Group.AST_071));
        university.addStudent(new Student("Агинская", Faculty.CONSTRUCTION, Group.AST_072));
        university.addStudent(new Student("Кошечкин", Faculty.CONSTRUCTION, Group.AST_072));
        university.addStudent(new Student("Саперов", Faculty.CONSTRUCTION, Group.AST_072));
        university.addStudent(new Student("Болтунов", Faculty.MECHANICAL_ENGINEERING, Group.ARR_081));
        university.addStudent(new Student("Исаева", Faculty.MECHANICAL_ENGINEERING, Group.ARR_081));
        university.addStudent(new Student("Макаров", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));
        university.addStudent(new Student("Белякова", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));


        university.addMark(university.getStudent("Иванов"), Subject.TECHNICAL_DRAWING, 7);
        university.addMark(university.getStudent("Иванов"), Subject.MATH, 6);
        university.addMark(university.getStudent("Иванов"), Subject.CHEMISTRY, 8);
        university.addMark(university.getStudent("Ахметова"), Subject.MECHANICS, 9);
        university.addMark(university.getStudent("Ахметова"), Subject.LANGUAGE, 5);
        university.addMark(university.getStudent("Ахметова"), Subject.PHYSICS, 6);
        university.addMark(university.getStudent("Агинская"), Subject.INFORMATICS, 8);
        university.addMark(university.getStudent("Агинская"), Subject.MECHANICS, 6);
        university.addMark(university.getStudent("Агинская"), Subject.LANGUAGE, 8);
        university.addMark(university.getStudent("Кошечкин"), Subject.MATH, 9);
        university.addMark(university.getStudent("Кошечкин"), Subject.INFORMATICS, 9);
        university.addMark(university.getStudent("Кошечкин"), Subject.CHEMISTRY, 8);
        university.addMark(university.getStudent("Саперов"), Subject.CHEMISTRY, 8);
        university.addMark(university.getStudent("Саперов"), Subject.INFORMATICS, 8);
        university.addMark(university.getStudent("Саперов"), Subject.TECHNICAL_DRAWING, 10);
        university.addMark(university.getStudent("Болтунов"), Subject.TECHNICAL_DRAWING, 7);
        university.addMark(university.getStudent("Болтунов"), Subject.PHYSICS, 4);
        university.addMark(university.getStudent("Болтунов"), Subject.MECHANICS, 5);
        university.addMark(university.getStudent("Исаева"), Subject.LANGUAGE, 5);
        university.addMark(university.getStudent("Исаева"), Subject.PHYSICS, 9);
        university.addMark(university.getStudent("Исаева"), Subject.CHEMISTRY, 7);
        university.addMark(university.getStudent("Макаров"), Subject.MATH, 8);
        university.addMark(university.getStudent("Макаров"), Subject.INFORMATICS, 8);
        university.addMark(university.getStudent("Макаров"), Subject.CHEMISTRY, 7);
        university.addMark(university.getStudent("Белякова"), Subject.MATH, 5);
        university.addMark(university.getStudent("Белякова"), Subject.LANGUAGE, 6);
        university.addMark(university.getStudent("Белякова"), Subject.TECHNICAL_DRAWING, 8);

        try {
            university.averageMarkOfStudent();
        } catch (NoMarksException e) {
            e.printStackTrace();
        }
        try {
            university.averageMarkOfGroup();
        } catch (NoMarksException | NoAvailableStudentsException e) {
            e.printStackTrace();
        }
        try {
            university.averageMarkOfFaculty();
        } catch (NoMarksException e) {
            e.printStackTrace();
        }
    }
}
