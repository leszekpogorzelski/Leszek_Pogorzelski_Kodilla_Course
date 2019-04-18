package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        taskExecuted = true;
    }

    @Override
    public String executeTask() {
        return "I'm painting my " + whatToPaint + " on " + color;
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

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
    public  boolean getTaskExecuted(){
        return taskExecuted;
    }
}
