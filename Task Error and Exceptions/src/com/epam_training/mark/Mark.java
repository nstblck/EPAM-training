package com.epam_training.mark;

public class Mark {
    private Subject subject;
    private Integer mark;

    private Mark() {
    }

    public Integer getMark() {
        return mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public Mark(Subject subject, Integer mark) throws IllegalArgumentException {
        if (mark < 0 | mark > 10) {
            throw new IllegalArgumentException("Isn't a valid mark, must be from 0 to 10");
        }
        this.mark = mark;
        this.subject = subject;
    }
}
