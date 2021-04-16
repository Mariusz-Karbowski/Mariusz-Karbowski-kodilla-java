package com.kodilla.patterns2.observer.homework;

public class Homework {

    private String subject;
    private String description;

    public Homework(String subject, String description) {
        this.subject = subject;
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return ", Subject: " + subject + " (" + description + ")";
    }
}
