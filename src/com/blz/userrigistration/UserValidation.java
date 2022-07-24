package com.blz.userrigistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        boolean isFirstNameValid = Pattern.matches(FIRST_NAME, firstName);
        if (!isFirstNameValid) {
            System.out.println("First Name is invalid...Please enter proper first name");
            System.exit(0);
        }
        return Pattern.matches(FIRST_NAME, firstName);
    }
}
