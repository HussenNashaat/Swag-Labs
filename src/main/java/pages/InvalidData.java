package pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class InvalidData {
    WebDriver driver;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\hussen\\IdeaProjects\\SwagLabs\\src\\test\\resources\\read.json"));
    By userNameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("login-button");
    By errorMessage = By.cssSelector("h3[data-test=\"error\"]");

    public InvalidData(WebDriver driver) throws IOException, ParseException {
        this.driver = driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/");
    }

    public void enterInvalidUserName() throws InterruptedException{
        driver.findElement(userNameLocator).clear();
        driver.findElement(userNameLocator).sendKeys(jsonObject.get("invalidUserName").toString());
    }

    public void enterValidPassword() throws InterruptedException{
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(jsonObject.get("password").toString());
    }

    public void enterValidUserName() throws InterruptedException{
        driver.findElement(userNameLocator).clear();
        driver.findElement(userNameLocator).sendKeys(jsonObject.get("username").toString());
    }

    public void enterInvalidPassword() throws InterruptedException{
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(jsonObject.get("invalidPassword").toString());
    }

    public void pressLoginButton() throws InterruptedException{
        driver.findElement(loginButtonLocator).click();
    }

    public String checkErrorMessage() throws InterruptedException{
        return driver.findElement(errorMessage).getText();
    }
}
