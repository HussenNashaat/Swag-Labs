package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentAndCheckout {
    WebDriver driver;
    By removeItem = By.id("remove-sauce-labs-bolt-t-shirt");
    By checkOutButton = By.id("checkout");
    By paymentPageHeader = By.className("title");

    public PaymentAndCheckout(WebDriver driver){
        this.driver= driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
    }

    public void removeItem(){
        driver.findElement(removeItem).click();
    }

    public void clickCheckOut(){
        driver.findElement(checkOutButton).click();
    }

    public String paymentPageHeader(){
        return driver.findElement(paymentPageHeader).getText();
    }
}
