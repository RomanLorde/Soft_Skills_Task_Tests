package com.cydeo.tests;

import com.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Valid_Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String appUrl = "https://login2.nextbasecrm.com";
        driver.get(appUrl);

        String [] arr = new String[]{"helpdesk21@cybertekschool.com", "hr21@cybertekschool.com", "marketing21@cybertekschool.com"};
        String pass = "UserUser";

        for (int i = 0; i < arr.length; i++){
            Thread.sleep(2000);
            WebElement login = driver.findElement(By.cssSelector("input[type='text']"));
            login.sendKeys(arr[i]);
            Thread.sleep(2000);
            WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
            password.sendKeys(pass);
            WebElement button = driver.findElement(By.cssSelector("input[type='Submit']"));
            button.click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("span[class='user-name']")).click();
            driver.findElement(By.xpath("//span[.='Log out']")).click();
            driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).clear(); // this works


        }

        driver.close();
    }
}
