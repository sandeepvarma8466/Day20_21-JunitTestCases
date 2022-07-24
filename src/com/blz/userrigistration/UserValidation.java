package com.blz.userrigistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

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
}
