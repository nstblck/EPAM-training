package com.epam_training;

import java.util.ArrayList;
import java.util.List;

public enum Group {
    AST_071, AST_072, AST_073, ARR_081, ARR_082, AKP_081;
    private List<? extends Group> group;
    private List<Student> students = new ArrayList();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public List<Subject> subjectsAST_071() {
        if (group == Group.AST_071)
        AST_071.get(Subject.MATH, Subject.BIOLOGY, Subject.CHEMISTRY);
        AST_071.getSubjects
        return subjectsAST_071;
    }


}
