package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.login;
import static tests.LoginPageTest.customer;

public class EmptyInfoTest {

    @Test
    public void CheckEmptyInfo() throws InterruptedException {
        login.navigate();
        login.enterUserName();
        login.enterPassword();
        login.loginButton();
        customer.navigate();
        customer.pressContinue();
        System.out.println("Error: First Name is required");
        Assert.assertEquals(customer.checkErrorMessage(),"Error: First Name is required");
    }
}
