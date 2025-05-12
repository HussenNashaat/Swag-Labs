package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProcessInfo {
    WebDriver driver;
    By finishButton = By.id("finish");
    By confirmationPageHeader = By.className("title");

    public ProcessInfo(WebDriver driver){
        this.driver = driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/checkout-step-two.html");
    }

    public void scrollToTargetElement(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(finishButton));
    }
    public void clickFinishButton() throws InterruptedException{
        driver.findElement(finishButton).click();
    }

    public String confirmationPageHeader() throws InterruptedException{
        return driver.findElement(confirmationPageHeader).getText();
    }
}
