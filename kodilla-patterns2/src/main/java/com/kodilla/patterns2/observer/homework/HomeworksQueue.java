package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworksQueue implements Observable {

    private List<Observer> observers;
    private List<Homework> homeworks;
    private final Student student;

    public HomeworksQueue(Student student) {
        this.observers = new ArrayList<>();
        this.homeworks = new ArrayList<>();
        this.student = student;
    }

    public void addHomework(Homework task) {
        homeworks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }

    public Student getStudent() {
        return student;
    }
}
