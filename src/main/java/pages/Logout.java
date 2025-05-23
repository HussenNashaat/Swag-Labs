package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logout {
    WebDriver driver;
    By menuButton = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");
    public Logout(WebDriver driver){
        this.driver = driver;
    }

    public void pressMenuIcon() throws InterruptedException{
        driver.findElement(menuButton).click();
    }

    public void pressLogout() throws InterruptedException{
        driver.findElement(logoutButton).click();
    }

    public String checkURL() throws  InterruptedException{
        return driver.getCurrentUrl();
    }


}
