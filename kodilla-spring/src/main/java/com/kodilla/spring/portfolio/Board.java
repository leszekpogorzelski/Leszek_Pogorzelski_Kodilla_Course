package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public final class Board {
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;


    public List<String> getToDoList() {
        return toDoList.getTasks();
    }

    public List<String> getInProgressList() {
        return inProgressList.getTasks();
    }

    public List<String> getDoneList() {
        return doneList.getTasks();
    }
}
