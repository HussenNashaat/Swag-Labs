package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.LoginPageTest.home;

public class HomePageTest {
    @Test
    public void addToCartTest() throws InterruptedException{
        home.navigate();
        home.addToCart();
        Thread.sleep(1500);
        Assert.assertEquals(home.numberOfItems(),"2");
        System.out.println(home.numberOfItems());
        home.goToCartPage();
        Thread.sleep(1500);
        System.out.println(home.cartPageHeader());
        Assert.assertEquals(home.cartPageHeader(),"Your Cart");
    }
}
