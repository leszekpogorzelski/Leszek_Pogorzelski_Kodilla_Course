package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String whatTask) {
        switch (whatTask) {
            case DRIVING:
                return new DrivingTask("Riding my bike.", "school", "bike");
            case PAINTING:
                return new PaintingTask("PAinting my fence.", "blue", "fence");
            case SHOPPING:
                return new ShoppingTask("Buying bannanas", "bannanas", 5.0);
            default:
                return null;
        }
    }
}
