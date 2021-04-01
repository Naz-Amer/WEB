package com.weboerderspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 */

public class LoginPage {

    WebDriver driver;

    By inputUsername = By.id("ctl00_MainContent_username");

    By inputPassword = By.id("ctl00_MainContent_password");

    By loginButton = By.id("ctl00_MainContent_login_button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToWebOrder(String username,String password){

        driver.findElement(inputUsername).sendKeys(username);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(loginButton).click();

    }

    public void inputuserName(String uid) {
        driver.findElement(inputUsername).sendKeys("uid");
    }

    public void inputPass(String pass) {

        driver.findElement(inputPassword).sendKeys("pass");

    }


    public void Loginbutton() {

        driver.findElement(loginButton).click();

    }
}
