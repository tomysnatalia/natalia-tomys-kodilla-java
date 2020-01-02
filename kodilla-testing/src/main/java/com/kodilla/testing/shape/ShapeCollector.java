package com.kodilla.testing.shape;

import java.util.ArrayList;


class ShapeCollector {

    ArrayList<Shape> shapeCollection = new ArrayList<Shape> ();


    public ArrayList<Shape> getShapeCollection() {
        return shapeCollection;
    }


    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
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





