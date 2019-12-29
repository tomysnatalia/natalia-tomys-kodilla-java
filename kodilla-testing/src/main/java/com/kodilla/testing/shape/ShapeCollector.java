package com.kodilla.testing.shape;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Objects;

interface Shape {
    String getShapeName();
    double getField();
}

class Circle implements Shape {
    String name = "Circle";
    double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return Math.PI * (radius*radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}

class Triangle implements Shape {
    String name = "Triangle";
    double triangleBasis;
    double triangleHeight;

    public Triangle (double triangleBasis, double triangleHeight){
        this.triangleBasis = triangleBasis;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.triangleBasis, triangleBasis) == 0 &&
                Double.compare(triangle.triangleHeight, triangleHeight) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, triangleBasis, triangleHeight);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", triangleBasis=" + triangleBasis +
                ", triangleHeight=" + triangleHeight +
                '}';
    }

    public String getShapeName() {
        return name;
    }
    public double getField(){
        return (triangleBasis* triangleHeight)/2;
    }
}

class Square implements Shape {
    String name = "Square";
    double edgeLength;

    public Square (double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.edgeLength, edgeLength) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edgeLength);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", edgeLength=" + edgeLength +
                '}';
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return edgeLength*edgeLength;
    }
}


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
        shapeCollection.add(circle);
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





