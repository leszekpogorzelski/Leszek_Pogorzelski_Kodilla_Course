package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        taskExecuted = true;
    }

    @Override
    public String executeTask() {
        return "I'm riding with my " + using + " to " + where;

    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskExecuted) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
    public  boolean getTaskExecuted(){
        return taskExecuted;
    }
}
