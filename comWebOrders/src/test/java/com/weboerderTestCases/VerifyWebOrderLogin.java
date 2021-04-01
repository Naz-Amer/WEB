package com.weboerderTestCases;

import com.weboerderspages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyWebOrderLogin {

    private String baseUrl = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
    WebDriver driver;

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @Test

    public void verifyValidLogin() {

        LoginPage login = new LoginPage(driver);
        login.loginToWebOrder("Tester","test");


    }

    @AfterTest

    public void closeUp() {
        driver.close();
        driver.quit();
    }
}
