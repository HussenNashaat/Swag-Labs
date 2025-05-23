package pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class CustomerDetails {

    WebDriver driver;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\hussen\\IdeaProjects\\SwagLabs\\src\\test\\resources\\read.json"));
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueButton = By.id("continue");
    By processInfoHeader = By.className("title");
    By errorMessage = By.xpath("//h3[@data-test=\"error\"]");
    public CustomerDetails(WebDriver driver) throws IOException, ParseException {
        this.driver = driver;
    }

    public void navigate(){
        driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void enterFirstName() throws InterruptedException{
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(jsonObject.get("firstName").toString());
    }

    public void enterLastName() throws InterruptedException{
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(jsonObject.get("lastName").toString());
    }

    public void enterPostalCode() throws InterruptedException{
        driver.findElement(postalCodeField).clear();
        driver.findElement(postalCodeField).sendKeys(jsonObject.get("postalCode").toString());
    }

    public void pressContinue() throws InterruptedException{
        driver.findElement(continueButton).click();
    }

    public String processInfoHeader() throws InterruptedException{
        return driver.findElement(processInfoHeader).getText();
    }

    public String checkErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

}
