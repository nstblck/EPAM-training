package com.epam_training.Faculties;

import com.epam_training.Group;

import java.util.ArrayList;
import java.util.List;

public enum Faculty {
    MECHANICAL_ENGINEERING, CIVIL_ENGINEERING, CONSTRUCTION;
    private List<Group> groups = new ArrayList();

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
