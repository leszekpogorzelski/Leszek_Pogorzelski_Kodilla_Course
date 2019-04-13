package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
private List <String> tasks;

public TaskList(){
    tasks = new ArrayList<>();
}

    public List<String> getTasks() {
        return tasks;
    }
}
