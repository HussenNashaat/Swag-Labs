package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.info;

public class ProcessInfoTest {
    @Test
    public void confirmProcess() throws InterruptedException{
        info.navigate();
        info.scrollToTargetElement();
        Thread.sleep(1500);
        info.clickFinishButton();
        Thread.sleep(1500);
        System.out.println(info.confirmationPageHeader());
        Assert.assertEquals(info.confirmationPageHeader(),"Checkout: Complete!");
    }
}