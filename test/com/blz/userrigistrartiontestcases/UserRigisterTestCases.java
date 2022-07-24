package com.blz.userrigistrartiontestcases;

import com.blz.userrigistration.UserValidation;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRigisterTestCases {
    UserValidation user = new UserValidation();
    @Test
    public void givenFirstName_whenProper_shoildReturnTrue() {
        boolean result = user.validateFirstName("Rajesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_whenProper_shoildReturnTrue() {
        boolean result = user.validateLastName("Dubyala");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_whenProper_shoildReturnTrue() {
        boolean result = user.validateEmail("nikita5@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNo_whenProper_shoildReturnTrue() {
        boolean result = user.validatePhoneNumber("9075194765");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword1_whenProper_shoildReturnTrue() {
        boolean result = user.validatePassword("yjhanna98");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword2_whenProper_shoildReturnTrue() {
        boolean result = user.validatePassword2("Khannalll");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword3_whenProper_shoildReturnTrue() {
        boolean result = user.validatePassword3("K9allakk5skKksN");
        Assert.assertEquals(true, result);
    }

}
