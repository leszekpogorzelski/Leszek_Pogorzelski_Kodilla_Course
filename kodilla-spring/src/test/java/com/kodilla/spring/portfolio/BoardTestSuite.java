package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
       Board board = context.getBean(Board.class);
       board.getToDoList().add("To do");
       board.getDoneList().add("Done");
       board.getInProgressList().add("In progress!");

        //When
        String toDo = board.getToDoList().get(0);
        String done = board.getDoneList().get(0);
        String inProgress = board.getInProgressList().get(0);

        //Then
        Assert.assertEquals("To do", toDo);
        Assert.assertEquals("Done", done);
        Assert.assertEquals("In progress!", inProgress);
    }

}
