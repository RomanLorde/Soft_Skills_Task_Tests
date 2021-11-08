package com.cydeo;

import com.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpDeskPositive {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "http://login2.nextbasecrm.com";

        driver.get(url);

        String userName = "helpdesk21@cybertekschool.com";
        String password = "UserUser";

        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.className("login-btn")).click();

    }
}


