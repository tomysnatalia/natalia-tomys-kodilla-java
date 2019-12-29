package com.kodilla.testing.shape;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle( 5);
        //When
        shapeCollector.addFigure(shape);
        // Then
       Assert.assertEquals(1, shapeCollector.getShapeCollection().size());

    }


    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeCollection());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        Assert.assertNull(shapeResult);

    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(shape);
        // When
        ArrayList<Shape> shapeResultList = shapeCollector.getShapeCollection();
        Assert.assertEquals(shapeList.toString(), shapeResultList.toString());


    }
}


