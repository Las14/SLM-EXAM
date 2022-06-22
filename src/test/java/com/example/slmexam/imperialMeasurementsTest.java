package com.example.slmexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class imperialMeasurementsTest {
imperialMeasurements measurementsTest = new imperialMeasurements();

@Test
    void cmTest (){
    double a = 4;

    double expectedResult = 10.16;

    double result = measurementsTest.cm(a);

    assertEquals(expectedResult, result);

}
    @Test
    void meterTest (){
        double a = 4;

        double expectedResult = 3.6563071297989027;

        double result = measurementsTest.meter(a);

        assertEquals(expectedResult, result);

    }



}