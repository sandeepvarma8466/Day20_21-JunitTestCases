package com.blz.userrigistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final String PHONE_NUMBER = "^[0-9]{10}";
    private static final String PASSWORD_RULE1 = "^[A-Z a-z 0-9]{8,}$";
    private static final String PASSWORD_RULE2 = "(?=.*[A-Z])[a-zA-Z0-9].{8,}$";
    private static final String PASSWORD_RULE3 = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9].{8,}$";
    private static final String PASSWORD_RULE4 = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";

    public boolean validateFirstName(String firstName) {
        boolean isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {
            System.out.println("First Name is invalid...Please enter proper first name");
            System.exit(0);
        }
        return Pattern.matches(FIRST_NAME, firstName);
    }

    public boolean validateLastName(String lastName) {
        boolean isLastNameValid = Pattern.matches(LAST_NAME, lastName);
        if (!isLastNameValid) {
            System.out.println("Last Name is invalid...Please enter proper last name");
            System.exit(0);
        }
        return Pattern.matches(LAST_NAME, lastName);
    }

    public boolean validateEmail(String mail) {
        boolean isMailValid = Pattern.matches(EMAIL, mail);
        if (!isMailValid) {
            System.out.println("E-mail is invalid...Please enter e-mail");
            System.exit(0);
        }
        return Pattern.matches(EMAIL, mail);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        boolean isNumberValid = Pattern.matches(PHONE_NUMBER, phoneNumber);
        if (!isNumberValid) {
            System.out.println("Phone Number is invalid...Please enter proper phone-number");
            System.exit(0);
        }
        return Pattern.matches(PHONE_NUMBER, phoneNumber);
    }

    public boolean validatePassword(String password) {
        boolean isPasswordValid = Pattern.matches(PASSWORD_RULE1, password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid...Please enter proper password");
            System.exit(0);
        }
        return Pattern.matches(PASSWORD_RULE1, password);
    }

    public boolean validatePassword2(String password) {
        boolean isPasswordValid = Pattern.matches(PASSWORD_RULE2, password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid...Please enter proper password");
            System.exit(0);
        }
        return Pattern.matches(PASSWORD_RULE2, password);
    }

    public boolean validatePassword3(String password) {
        boolean isPasswordValid = Pattern.matches(PASSWORD_RULE3, password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid...Please enter proper password");
            System.exit(0);
        }
        return Pattern.matches(PASSWORD_RULE3, password);
    }

    public boolean validatePassword4(String password) {
        boolean isPasswordValid = Pattern.matches(PASSWORD_RULE4, password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid...Please enter proper password");
            System.exit(0);
        }
        return Pattern.matches(PASSWORD_RULE4, password);
    }
}
