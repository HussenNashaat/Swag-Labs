package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.customer;

public class CustomerDetailsTest {
    @Test
    public void fillCustomerData() throws InterruptedException{
        customer.navigate();
        customer.enterFirstName();
        customer.enterLastName();
        customer.enterPostalCode();
        Thread.sleep(1500);
        customer.pressContinue();
        Thread.sleep(1500);
        System.out.println(customer.processInfoHeader());
        Assert.assertEquals(customer.processInfoHeader(),"Checkout: Overview");
    }
}
