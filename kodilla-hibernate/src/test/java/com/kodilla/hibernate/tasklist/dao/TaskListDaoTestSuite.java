package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
   private TaskListDao taskListDao;
    private static final String LIST_NAME = "FIRST LIST";
    private static final String DESCRIPTION = "NEW LIST LIST";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        String name = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName(name);
        Assert.assertEquals(1, readTask.size());


        //CleanUp
        taskListDao.deleteByListName(name);
    }
}
