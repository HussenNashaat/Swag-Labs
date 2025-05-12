package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.invalidData;

public class InvalidUserNameTest {
    @Test
    public void invalidUsernameTest() throws InterruptedException{
        invalidData.enterInvalidUserName();
        Thread.sleep(1500);
        invalidData.enterValidPassword();
        Thread.sleep(1500);
        invalidData.pressLoginButton();
        Thread.sleep(1500);
        Assert.assertEquals(invalidData.checkErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }
}
