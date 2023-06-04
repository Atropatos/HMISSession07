package ual.hmis.session05;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ual.hmis.session05.*;
public class Exercise1Test {

	   Exercise1 exercise1 = new Exercise1();

    @Test
    public void testTransformarDivisibleBy2() {
        int x = 4;  // divisible by 2
        int expectedResult = 1;
        assertEquals(expectedResult, exercise1.transformar(x));
    }

    @Test
    public void testTransformarDivisibleBy3() {
        int x = 9;  // divisible by 3
        int expectedResult = 1;
        assertEquals(expectedResult, exercise1.transformar(x));
    }

    @Test
    public void testTransformarDivisibleBy5() {
        int x = 25;  // divisible by 5
        int expectedResult = 1;
        assertEquals(expectedResult, exercise1.transformar(x));
    }

    @Test
    public void testTransformarNotDivisible() {
        int x = 7;  // not divisible by 2, 3 or 5
        int expectedResult = 7;
        assertEquals(expectedResult, exercise1.transformar(x));
    }
    
   
}
