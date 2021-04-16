package com.kodilla.patterns2.observer.homework;

public class Student {

    private String name;
    private String surname;
    private HomeworksQueue homeworksQueue;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        homeworksQueue = new HomeworksQueue(this);
    }

    public void addTask(Homework task) {
        homeworksQueue.addHomework(task);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public HomeworksQueue getHomeworksQueue() {
        return homeworksQueue;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
