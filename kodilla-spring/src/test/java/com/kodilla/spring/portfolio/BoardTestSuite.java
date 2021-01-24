package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String doneTask = "Task no1";
        String inProgressTask = "Task no2";
        String toDoTask = "Task no3";
        board.getDoneList().getTasks().add(doneTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getToDoList().getTasks().add(toDoTask);
        //Then
        assertEquals(doneTask, board.getDoneList().getTasks().get(0));
        assertEquals(inProgressTask, board.getInProgressList().getTasks().get(0));
        assertEquals(toDoTask, board.getToDoList().getTasks().get(0));
    }
}
