package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCRM_HR_Login_Valid_Data {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String appUrl = "https://login2.nextbasecrm.com";
        String username = "hr21@cybertekschool.com";
        String password = "UserUser";
        driver.get(appUrl);

        WebElement loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys(username);

        WebElement pwdBox = driver.findElement(By.cssSelector("input[name= 'USER_PASSWORD']"));
        pwdBox.sendKeys(password, Keys.ENTER);

        WebElement loginVerification = driver.findElement(By.xpath("//span[@id='user-name']"));
        String loggedUser = loginVerification.getText();

        String result = (loggedUser.equals(username)) ? "Login verification for HR user PASS" : "Login verification for HR user FAIL";
        System.out.println(result);

        WebElement dropDown = driver.findElement(By.id("user-name"));
        dropDown.click();
        Thread.sleep(3000);


        WebElement logoutHr = driver.findElement(By.xpath("//span[.='Log out']"));
        logoutHr.click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).clear();
        loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("marketing21@cybertekschool.com");

        pwdBox = driver.findElement(By.cssSelector("input[name= 'USER_PASSWORD']"));
        pwdBox.sendKeys(password, Keys.ENTER);
        Thread.sleep(2000);

        dropDown = driver.findElement(By.id("user-name"));
        dropDown.click();

        WebElement logoutMrkt= driver.findElement(By.xpath("//span[.='Log out']"));
        logoutMrkt.click();

        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).clear();
        loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("helpdesk21@cybertekschool.com");

        pwdBox = driver.findElement(By.cssSelector("input[name= 'USER_PASSWORD']"));
        pwdBox.sendKeys(password, Keys.ENTER);
        Thread.sleep(2000);

        dropDown = driver.findElement(By.id("user-name"));
        dropDown.click();

        WebElement logoutHelpDesk= driver.findElement(By.xpath("//span[.='Log out']"));
        logoutHelpDesk.click();

        Thread.sleep(2000);
        driver.close();

    }
}
