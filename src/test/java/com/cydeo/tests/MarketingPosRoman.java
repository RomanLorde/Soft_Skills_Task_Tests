package com.cydeo.tests;

import com.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarketingPosRoman {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome") ;
        String url = "https://login2.nextbasecrm.com";
        driver.get(url);
        Thread.sleep(2000);
        String userName = "marketing21@cybertekschool.com";
        String pass = "UserUser";
        WebElement loginHr = driver.findElement(By.cssSelector("input[placeholder='Login']"));
        loginHr.sendKeys(userName);
        WebElement passwordHr = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passwordHr.sendKeys(pass);
        WebElement button = driver.findElement(By.cssSelector("input[type='Submit']"));
        button.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
