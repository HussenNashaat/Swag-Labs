package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.login;

public class InvalidPasswordTest {
    @Test
    public void invalidPasswordTest() throws InterruptedException{
        login.navigate();
        login.enterUserName();
        Thread.sleep(1500);
        login.enterInvalidPassword();
        Thread.sleep(1500);
        login.loginButton();
        Thread.sleep(1500);
        Assert.assertEquals(login.checkErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }
}
