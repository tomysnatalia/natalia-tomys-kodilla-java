package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test numbers begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test numbers completed");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList();

        //When
        ArrayList<Integer> resultList = numbersList.exterminate(emptyList);
        System.out.println("Testing emptyList");

        //Then
        Assert.assertEquals(emptyList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator numbersList = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList();

        for( int number : normalList) {
            normalList.add(number);
            normalList.add(number+1);
        }
        //When
        ArrayList<Integer> resultList = numbersList.exterminate(normalList);
        System.out.println("Testing normalList");

        //Then
        Assert.assertEquals(normalList, resultList);

    }
}
