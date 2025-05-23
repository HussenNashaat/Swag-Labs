package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.logout;

public class LogoutTest {
    @Test
    public void logoutTest() throws InterruptedException{
        logout.pressMenuIcon();
        Thread.sleep(1500);

        logout.pressLogout();
        Thread.sleep(1500);
        Assert.assertEquals(logout.checkURL(), "https://www.saucedemo.com/");
    }
}
