package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.payment;

public class PaymentAndCheckoutTest {
    @Test
    public void checkout() throws InterruptedException{
        payment.navigate();
        payment.removeItem();
        Thread.sleep(1500);
        payment.clickCheckOut();
        Thread.sleep(1500);
        System.out.println(payment.paymentPageHeader());
        Assert.assertEquals(payment.paymentPageHeader(),"Checkout: Your Information");
    }
}
