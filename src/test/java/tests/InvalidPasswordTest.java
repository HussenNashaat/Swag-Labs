package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.invalidData;

public class InvalidPasswordTest {
    @Test
    public void invalidPasswordTest() throws InterruptedException{
        invalidData.navigate();
        invalidData.enterValidUserName();
        Thread.sleep(1500);
        invalidData.enterInvalidPassword();
        Thread.sleep(1500);
        invalidData.pressLoginButton();
        Thread.sleep(1500);
        Assert.assertEquals(invalidData.checkErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }
}
