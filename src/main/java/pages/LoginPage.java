package pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\hussen\\IdeaProjects\\SwagLabs\\src\\test\\resources\\read.json"));
    By userNameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("login-button");
    By homePageHeader = By.className("title");
    By errorMessage = By.cssSelector("h3[data-test=\"error\"]");
    public LoginPage(WebDriver driver) throws IOException, ParseException {
    this.driver = driver;

    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/");
    }

    public void enterUserName(){
    driver.findElement(userNameLocator).clear();
    driver.findElement(userNameLocator).sendKeys(jsonObject.get("username").toString());
    }

    public void enterPassword(){
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(jsonObject.get("password").toString());
    }

    public void loginButton(){
        driver.findElement(loginButtonLocator).click();
    }

    public String homePageHeader(){
        return driver.findElement(homePageHeader).getText();
    }

    public void enterInvalidUserName() throws InterruptedException{
        driver.findElement(userNameLocator).clear();
        driver.findElement(userNameLocator).sendKeys(jsonObject.get("invalidUserName").toString());
    }

    public void enterInvalidPassword() throws InterruptedException{
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(jsonObject.get("invalidPassword").toString());
    }

    public String checkErrorMessage() throws InterruptedException{
        return driver.findElement(errorMessage).getText();
    }

}
