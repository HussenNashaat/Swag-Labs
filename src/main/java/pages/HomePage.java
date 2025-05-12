package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By addToCart3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By addToCart4 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By numberOfItems = By.className("shopping_cart_badge");
    By cartLogo = By.className("shopping_cart_link");
    By cartPageHeader = By.className("title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
    }

    public void addToCart() {
        driver.findElement(addToCart3).click();
        driver.findElement(addToCart4).click();
        }

    public String numberOfItems(){
        return driver.findElement(numberOfItems).getText();
    }

    public void goToCartPage(){
        driver.findElement(cartLogo).click();
    }

    public String cartPageHeader(){
        return driver.findElement(cartPageHeader).getText();
    }
}
