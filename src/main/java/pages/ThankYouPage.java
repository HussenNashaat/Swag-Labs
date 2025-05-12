package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {
    WebDriver driver;
    By backToHomeButton = By.id("back-to-products");
    By homePageHeader = By.className("title");

    public ThankYouPage(WebDriver driver) throws InterruptedException{
        this.driver = driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/checkout-complete.html");
    }

    public void clickBackToHomeButton() throws InterruptedException{
        driver.findElement(backToHomeButton).click();
    }

    public String homePageHeader() throws InterruptedException{
        return driver.findElement(homePageHeader).getText();
    }
}
