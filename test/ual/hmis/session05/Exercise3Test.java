package ual.hmis.session05;
import ual.hmis.session05.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Exercise3Test {

    private final Exercise3 exercise3 = new Exercise3();

    @Test
    public void testMaskedPasswordShort() {
        String password = "123";
        String expected = "password too short";
        assertEquals(expected, exercise3.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordLength5and8() {
        String password = "123456";
        String expected = "********";
        assertEquals(expected, exercise3.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordLength12and40() {
        String password = "123456789012";
        String expected = "************";
        assertEquals(expected, exercise3.maskedPassword(password));
    }

    @Test
    public void testMaskedPasswordTooLong() {
        String password = "123456789012345678901234567890123456789012";
        String expected = "password too long";
        assertEquals(expected, exercise3.maskedPassword(password));
    }
}

