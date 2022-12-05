package com.niteshrajput.passwordvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorApplicationTests {

    private final PasswordValidatorApplication application = new PasswordValidatorApplication();

    @Test
    void validateLengthTest() {
        String password = "Abcdefghij";
        boolean flag = false;
        try {
            flag = application.validateLength(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(flag, "true");
    }

    @Test
    void validateLengthNegativeTest() {
        String password = "abc";
        boolean flag = false;
        try {
            flag = application.validateLength(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(flag, "false");
    }

    @Test
    void validateNotNullTest() {
        String password = "abcds";
        boolean flag = false;
        try {
            flag = application.validateNotNull(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(flag, "true");
    }

    @Test
    void validateNullTest() {
        String password = null;
        boolean flag = false;
        try {
            flag = application.validateNotNull(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(flag, "false");
    }

    @Test
    void validateUpperCaseTest() {
        String password = "Abcd";
        boolean flag = false;
        try {
            flag = application.validateUpperCase(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(flag, "true");
    }

    @Test
    void validateUpperCaseNegativeTest() {
        String password = "abcd";
        boolean flag = false;
        try {
            flag = application.validateUpperCase(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(flag, "false");
    }

    @Test
    void validateLowerCaseTest() {
        String password = "abcd";
        boolean flag = false;
        try {
            flag = application.validateLowerCase(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(flag, "true");
    }

    @Test
    void validateLowerCaseNegativeTest() {
        String password = "ABC";
        boolean flag = false;
        try {
            flag = application.validateLowerCase(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(flag, "false");
    }

    @Test
    void validateNumberTest() {
        String password = "abcd123";
        boolean flag = false;
        try {
            flag = application.validateNumber(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(flag, "true");
    }

    @Test
    void validateNumberNegativeTest() {
        String password = "abcdef";
        boolean flag = false;
        try {
            flag = application.validateNumber(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(flag, "false");
    }
}
