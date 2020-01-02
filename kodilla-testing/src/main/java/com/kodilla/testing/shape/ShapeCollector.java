package com.kodilla.testing.shape;

import java.util.ArrayList;


class ShapeCollector {

    ArrayList<Shape> shapeCollection = new ArrayList<Shape> ();


    public void setShapeCollection(ArrayList<Shape> shapeCollection) {
        this.shapeCollection = shapeCollection;
    }

    public ArrayList<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public int getShape(){
        return shapeCollection.size();
    }

    public void addFigure(Shape shape) {
        Circle circle = new Circle (5);
        Circle circle2 = new Circle (2);
        shapeCollection.add(circle);
        shapeCollection.remove(circle2);
    }

    public boolean removeFigure (Shape shape){
        boolean result = false;
        if(shapeCollection.contains(shape)){
            shapeCollection.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure (int n){
        if (n<shapeCollection.size() && n>=0) {
            return shapeCollection.get(n);
        }else{
            return null;
        }
    }

    public void showFigures () {
        System.out.println(shapeCollection.toString());

        }

    }





