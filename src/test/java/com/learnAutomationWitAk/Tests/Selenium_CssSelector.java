package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_CssSelector {
    @Test
    public void test1()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");
//xpath
       //WebElement username= driver.findElement(By.xpath("//input[@id='login-username']"));

//css selector
        WebElement username= driver.findElement(By.cssSelector("//input[id='login-username']"));

        WebElement button= driver.findElement(By.cssSelector("//input[data-qa='hocewoqisi']"));
//Find all the items that has word Flilkart in it
        //WebElement image= driver.findElement(By.xpath("//img[@title='Flipkart'"));
     //List<WebElement> images= driver.findElements(By.xpath("//img[contains(@title,'Flipkart')]"));
//csss Selector
        WebElement image= driver.findElement(By.cssSelector("//img[title='Flipkart'"));
        List<WebElement> images= driver.findElements(By.cssSelector("//img[title*='Flipkart')]"));


    }

}
