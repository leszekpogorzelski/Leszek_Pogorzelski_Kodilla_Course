package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        taskExecuted = true;
    }

    @Override
    public String executeTask() {
        return "I'm buying " + quantity + " of " + whatToBuy;

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

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public  boolean getTaskExecuted(){
        return taskExecuted;
    }
}
