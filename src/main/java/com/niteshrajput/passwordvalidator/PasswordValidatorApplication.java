package com.niteshrajput.passwordvalidator;

import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Logger.*;

public class PasswordValidatorApplication {

    private static final Logger logger = getLogger("PasswordValidatorApplication");

    // 1
    public boolean validateLength(String password) throws Exception {
        if (validateNotNull(password) && password.length() >= 8)
            return true;
        else
            throw new Exception("Password should be larger than 8");
    }

    // 2
    public boolean validateNotNull(String password) throws Exception {
        if (password != null)
            return true;
        else
            throw new Exception("Password should not be null");
    }

    // 3
    public boolean validateUpperCase(String password) throws Exception {
        if (password.matches(".*[A-Z].*"))
            return true;
        else
            throw new Exception("Password should have one upper case at least");
    }

    // 4
    public boolean validateLowerCase(String password) throws Exception {
        if (password.matches(".*[a-z].*"))
            return true;
        else
            throw new Exception("Password should have one lower case at least");
    }

    //5
    public boolean validateNumber(String password) throws Exception {
        if (password.matches(".*\\d.*"))
            return true;
        else
            throw new Exception("Password should have one number at least");
    }

    private String validate(String password) throws Exception {
        String errorMessage = "";
        if (validateLength(password)) {
            boolean isLower = false, isNumber = false, isUpper = false;
            try {
                isUpper = validateUpperCase(password);
            } catch (Exception e) {
                errorMessage += e.getMessage() + "\n";
            }
            try {
                isLower = validateLowerCase(password);
            } catch (Exception e) {
                errorMessage += e.getMessage() + "\n";
            }
            try {
                isNumber = validateNumber(password);
            } catch (Exception e) {
                errorMessage += e.getMessage() + "\n";
            }

            if (isLower && isNumber && isUpper) {
                return "OK";
            }
        }
        return errorMessage;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            PasswordValidatorApplication application = new PasswordValidatorApplication();
            logger.info("Enter your password ::");
            String input = sc.nextLine();
            String result = application.validate(input);
            logger.info("Password Validation Result : "+ result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
