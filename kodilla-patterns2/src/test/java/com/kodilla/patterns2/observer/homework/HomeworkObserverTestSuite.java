package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkObserverTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student anna = new Student("Anna", "Wiśniewska");
        Student jan = new Student("Jan", "Nowak");
        Student greg = new Student("Grzegorz", "Kowalski");

        Homework facadePattern = new Homework("Facade Pattern", "The aim of the task is to Facade Pattern to ...");
        Homework decoratorPattern = new Homework("Decorator Pattern", "The aim of the task is to use Decorator Pattern to ...");
        Homework observerPattern = new Homework("Observer Pattern", "The aim of the task is to use Observer Pattern to ...");

        HomeworksQueue annasQueue = anna.getHomeworksQueue();
        HomeworksQueue jansQueue = jan.getHomeworksQueue();
        HomeworksQueue gregsQueue = greg.getHomeworksQueue();

        Mentor aj = new Mentor("Ajay", "Gosai");
        Mentor sg = new Mentor("Simon", "Greener");

        annasQueue.registerObserver(sg);
        jansQueue.registerObserver(aj);
        gregsQueue.registerObserver(aj);
        //When
        annasQueue.addHomework(facadePattern);
        annasQueue.addHomework(decoratorPattern);
        jansQueue.addHomework(facadePattern);
        gregsQueue.addHomework(facadePattern);
        gregsQueue.addHomework(observerPattern);
        //Then
        assertEquals(3, aj.getTasksQty());
        assertEquals(2, sg.getTasksQty());
    }
}
