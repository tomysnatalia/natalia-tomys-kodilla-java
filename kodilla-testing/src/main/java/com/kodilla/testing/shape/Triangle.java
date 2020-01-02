package com.kodilla.testing.shape;

import java.util.Objects;

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
