package tests;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class LoginPageTest {

    WebDriver driver = null;
    public static LoginPage login;
    public static HomePage home;
    public static PaymentAndCheckout payment;
    public static CustomerDetails customer;
    public static ProcessInfo info;
    public static ThankYouPage thankYou;
    public static Logout logout;

    @BeforeTest
    public void setUp() throws InterruptedException, IOException, ParseException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login = new LoginPage(driver);
        home = new HomePage(driver);
        payment = new PaymentAndCheckout(driver);
        customer = new CustomerDetails(driver);
        info = new ProcessInfo(driver);
        thankYou = new ThankYouPage(driver);
        logout = new Logout(driver);
    }

    @Test
    public void loginTest() throws InterruptedException {
        login.navigate();
        login.enterUserName();
        Thread.sleep(1500);
        login.enterPassword();
        Thread.sleep(1500);
        login.loginButton();
        Thread.sleep(1500);
        System.out.println(login.homePageHeader());
        Assert.assertEquals(login.homePageHeader(), "Products");
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
             driver.quit();
        }
    }
