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
}
