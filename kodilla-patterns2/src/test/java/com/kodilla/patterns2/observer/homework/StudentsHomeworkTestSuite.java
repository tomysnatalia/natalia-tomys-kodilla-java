package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentsHomeworkTestSuite {

    @Test
    public void testUpdate() {

        //Given
        Student johnSmith = new Student( "John Smith");
        Student janNowak = new Student("Jan Nowak");
        Student monikaKowalska = new Student("Monika Kowalska");

        Mentor adrianPazucha = new Mentor("Adrian Pazucha");
        Mentor adamKowalski = new Mentor("Adam Kowalski");

        johnSmith.registerObserver(adrianPazucha);
        janNowak.registerObserver(adamKowalski);
        monikaKowalska.registerObserver(adrianPazucha);

        //When
        johnSmith.addTask("1.2");
        janNowak.addTask("2.5");
        monikaKowalska.addTask("1.3");
        monikaKowalska.addTask("1.4");

        //Then
        assertEquals(3, adrianPazucha.getUpdateCount());
        assertEquals(1, adamKowalski.getUpdateCount());

    }
}
