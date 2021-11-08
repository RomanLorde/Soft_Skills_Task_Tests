package com.cydeo.tests;

import com.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextBaseCRM_HR_Login_Invalid_Data {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        String appUrl = "https://login2.nextbasecrm.com";
        String username = "hr21@cybertekschool.com";
        String password = "useruser";
        String expMsg = "Incorrect login or password";
        driver.get(appUrl);


        WebElement loginField = driver.findElement(By.xpath("//input[@placeholder='Login']"));
        loginField.sendKeys(username);

        WebElement pwdField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        pwdField.sendKeys(password, Keys.ENTER);

        String actMsg = driver.findElement(By.xpath("//div[@class= 'errortext']")).getText();

        String testResult = (actMsg.equals(expMsg))? "Invalid Login PASS" : "Invalid Login FAIL";
        System.out.println(testResult);

        Thread.sleep(2000);
        driver.close();

    }
}
