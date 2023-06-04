package ual.hmis.session05;
import ual.hmis.session05.*;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Exercise4Test {

    private final Exercise4 exercise4 = new Exercise4();

    @Test
    public void testMaskedPasswordTooShort() {
        String password = "123";
        String expected = "password too short";
        assertEquals(expected, exercise4.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordLengthBetweenFiveAndEight() {
        String password = "123456";
        String expected = "********";
        assertEquals(expected, exercise4.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordLengthBetweenTwelveAndForty() {
        String password = "123456789012";
        String expected = "************";
        assertEquals(expected, exercise4.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordTooLong() {
        String password = "123456789012345678901234567890123456789012";
        String expected = "password too long";
        assertEquals(expected, exercise4.maskedPassword(password));
    }
}

