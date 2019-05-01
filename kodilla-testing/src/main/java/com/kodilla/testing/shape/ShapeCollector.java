package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    Shape shape;

        public ShapeCollector(Shape shape){
            this.shape = shape;
        }
    public void addFigure(){
            shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures(int n){
        String show = shapes.get(n).getShapeName() + " " + shapes.get(n).getField();
        return show;

    }
    public int getShapesSize(){
            return shapes.size();
    }



   }
