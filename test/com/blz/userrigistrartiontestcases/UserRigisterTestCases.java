package com.blz.userrigistrartiontestcases;

import com.blz.userrigistration.UserValidation;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRigisterTestCases {
    @Test
    public void givenFirstName_whenProper_shoildReturnTrue() {
        UserValidation user = new UserValidation();
        boolean result = user.validateFirstName("Rajesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_whenProper_shoildReturnTrue() {
        UserValidation user = new UserValidation();
        boolean result = user.validateLastName("Dubyala");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_whenProper_shoildReturnTrue() {
        UserValidation user=new UserValidation();
        boolean result=user.validateEmail("nikita5@gmail.com");
        Assert.assertEquals(true,result);
    }
}
