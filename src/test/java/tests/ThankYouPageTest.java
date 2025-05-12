package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.thankYou;

public class ThankYouPageTest {
    @Test
    public void backToHome() throws InterruptedException{
        thankYou.navigate();
        thankYou.clickBackToHomeButton();
        Thread.sleep(1500);
        System.out.println(thankYou.homePageHeader());
        Assert.assertEquals(thankYou.homePageHeader(),"Products");
    }
}
