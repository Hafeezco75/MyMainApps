package Regex;

import org.junit.jupiter.api.Test;

import static Regex.DataValidator.validate;
import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    void validateUserEmail() {
        String email = "bahubali32@gmail.com";

        boolean result = validate(email);

        assertEquals(true, result);
    }

    @Test
    void validatePhoneNumber() {
        String phoneNumber = "(123) 456-7890";

        boolean result = DataValidator.validatePhoneNumber(phoneNumber);

        assertTrue(result);
    }
}