package com.epam_training;

import com.epam_training.Faculties.Faculty;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentsFromUniversity = new ArrayList<>();

    public University() {
        studentsFromUniversity.add(new Student("Иванов", Faculty.CONSTRUCTION, Group.AST_071));
        studentsFromUniversity.add(new Student("Петров", Faculty.CONSTRUCTION, Group.AST_071));
        studentsFromUniversity.add(new Student("Ахметова", Faculty.CONSTRUCTION, Group.AST_071));
        studentsFromUniversity.add(new Student("Иванова", Faculty.CONSTRUCTION, Group.AST_071));
        studentsFromUniversity.add(new Student("Агинская", Faculty.CONSTRUCTION, Group.AST_072));
        studentsFromUniversity.add(new Student("Кошечкин", Faculty.CONSTRUCTION, Group.AST_072));
        studentsFromUniversity.add(new Student("Саперов", Faculty.CONSTRUCTION, Group.AST_072));
        studentsFromUniversity.add(new Student("Тарасов", Faculty.CONSTRUCTION, Group.AST_073));
        studentsFromUniversity.add(new Student("Лещенко", Faculty.CONSTRUCTION, Group.AST_073));
        studentsFromUniversity.add(new Student("Мамаева", Faculty.CONSTRUCTION, Group.AST_073));
        studentsFromUniversity.add(new Student("Болтунов", Faculty.MECHANICAL_ENGINEERING, Group.ARR_081));
        studentsFromUniversity.add(new Student("Коваленко", Faculty.MECHANICAL_ENGINEERING, Group.ARR_081));
        studentsFromUniversity.add(new Student("Исаева", Faculty.MECHANICAL_ENGINEERING, Group.ARR_081));
        studentsFromUniversity.add(new Student("Макаров", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));
        studentsFromUniversity.add(new Student("Белякова", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));
        studentsFromUniversity.add(new Student("Ефимова", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));
        studentsFromUniversity.add(new Student("Никонов", Faculty.MECHANICAL_ENGINEERING, Group.ARR_082));
        studentsFromUniversity.add(new Student("Ефимова", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
        studentsFromUniversity.add(new Student("Третьяков", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
        studentsFromUniversity.add(new Student("Капустин", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
        studentsFromUniversity.add(new Student("Воронцов", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
        studentsFromUniversity.add(new Student("Грачов", Faculty.CIVIL_ENGINEERING, Group.AKP_081));
    }

    //TODO: методы пишем тут
    public void addStudent(Student a){
        studentsFromUniversity.add(a);
    }

    public void facultyPrint(Faculty faculty){
        System.out.println("Список студентов факультета "+ faculty);
        for(Student st:studentsFromUniversity){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st.toString());
            }
        }
    }
    public University(Group group){
        System.out.println("Список студентов группы "+ group);
        for(Student st:studentsFromUniversity){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
    }

    studentsFromUniversity.groupPrint(Group AST_071)

    //TODO сделать метод выдачи по группам и предметам (если группа такая-то у нее список предметов такой)
public List<Subject> getSubjectsByGroup(){
        ArrayList<Subject> subjectsByGroup = new ArrayList<>();
        for
}
}
