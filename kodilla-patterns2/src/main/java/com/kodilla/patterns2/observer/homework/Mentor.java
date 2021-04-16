package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private String lastname;
    private int tasksQty;

    public Mentor(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        tasksQty =0;
    }

    @Override
    public void update(HomeworksQueue homeworksQueue) {
        System.out.println(name + " " + lastname + " - New task from student: " + homeworksQueue.getStudent() + homeworksQueue.getHomeworks().get(homeworksQueue.getHomeworks().size() - 1));
        tasksQty++;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getTasksQty() {
        return tasksQty;
    }
}
