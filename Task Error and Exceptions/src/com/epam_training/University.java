package com.epam_training;

import com.epam_training.faculties.Faculty;
import com.epam_training.groups.Group;
import com.epam_training.mark.Journal;
import com.epam_training.mark.Subject;
import com.epam_training.persons.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private Journal journal;
    private ArrayList<Student> studentsFromUniversity;

    public University() {

//        studentsFromUniversity.add(new Student("Грачов", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
        journal = new Journal();
        studentsFromUniversity = new ArrayList<>();
//        Mark mark = new Mark();
//        mark.setMarksToStudent();
    }

    public void addStudent(Student a) {
        studentsFromUniversity.add(a);
        journal.addStudent(a);
    }

    public Student getStudent(String name) {
        for (Student student: studentsFromUniversity) {
            if (student.getName().equals(name))
                return student;
        }
        return null; // ToDo: replace with exceptions
    }

    public void addMark(Student a, Subject subject, Integer mark) {
        journal.setMark(a, subject, mark);
    }

    public void facultyPrint(Faculty faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student st : studentsFromUniversity) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public List<Subject> printSubjectsByGroup(Group group, Subject subject) {
        ArrayList<Subject> subjectsByGroup = new ArrayList<>();
        for (Student st : studentsFromUniversity) {
            if (st.getGroup().equals(group)) {
                subjectsByGroup.add(subject);
                System.out.println();
            }
        }
        if (subjectsByGroup.isEmpty()) {
            throw new NullPointerException("No any subjects!");
        }
        return subjectsByGroup;
    }

    public ArrayList<Student> getStudentsFromGroup(Group group) throws NullPointerException {
        ArrayList<Student> studentsSelectionBySameGroup = new ArrayList<>();
        for (Student student : studentsFromUniversity) {
            if (student.getGroup().equals(group))
                studentsSelectionBySameGroup.add(student);
        }
        if (studentsSelectionBySameGroup.isEmpty()) {
            throw new NullPointerException("No students in the group!");
        }
        return studentsSelectionBySameGroup;
    }


    private ArrayList<Student> getStudentsFromFaculty(Faculty faculty) {
        ArrayList<Student> studentsSelectionBySameFaculty = new ArrayList<>();
        for (Student student : studentsFromUniversity) {
            if (student.getFaculty().equals(faculty))
                studentsSelectionBySameFaculty.add(student);
        }
        if (studentsSelectionBySameFaculty.isEmpty()) {
            throw new NullPointerException("No students in the faculty!");
        }
        return studentsSelectionBySameFaculty;
    }

//    public void setMarksToStudent() throws MyCustomException {
//    }

    public void averageMarkOfStudent() {
        Double result = journal.getAverageCount(studentsFromUniversity.get(0));
        System.out.println("Средняя оценка по предмету равна" + result);
    }

    public void averageMarkOfGroup() {
        Double result = journal.getAverageCount(Subject.CHEMISTRY, getStudentsFromGroup(Group.AST_071));
        System.out.println("Средняя оценка по предмету для всей группы равна" + result);
    }

    public void averageMarkOfFaculty() {
        Double result = journal.getAverageCount(Subject.CHEMISTRY, getStudentsFromFaculty(Faculty.CONSTRUCTION));
        System.out.println("Средняя оценка по предмету для всего факультета равна" + result);
    }

    public void averageMarkOfUniversity() {
        Double result = journal.getAverageCount(Subject.CHEMISTRY);
        System.out.println("Средняя оценка по предмету для всего университета равна" + result);
    }
}
