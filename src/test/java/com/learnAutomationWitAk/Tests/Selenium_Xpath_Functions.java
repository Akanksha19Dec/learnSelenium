package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_Xpath_Functions {


    @Test
    public void text()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://katalon-demo-cura.herokuapp.com/");


        //<a id="btn-make-appointment" href="./profile.php#login" class="btn btn-dark btn-lg">Make Appointment</a>
       // WebElement makeapp = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));

       // WebElement makeapp = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));

       // WebElement makeapp = driver.findElement(By.xpath("//a[text()='Make Appointment']"));

        //WebElement makeapp = driver.findElement(By.xpath("//a[contains(text(),'Make')]"));

        //WebElement makeapp = driver.findElement(By.xpath("//a[contains(@id,'appointment')]"));

        //WebElement makeapp = driver.findElement(By.xpath("//a[starts-with(@href,'./profile')]"));

       // WebElement makeapp = driver.findElement(By.xpath("//a[ends-with(text(),'Appointment')]"));


       // WebElement makeapp = driver.findElement(By.xpath("`//a[substring(text(), string-length(text()) - string-length('Appointment') + 1) = 'Appointment']`"));



       // subString(value , startindex of the last element)
       // value = text() -->Make Appointment  --. last elemnet -->Appointment

        //start index --> start index of Appointment

        //Full length -->string-length(text())  --> it find teh length of the value which you pass  -->15
 //string-length('Appointment')  --  9
        //+1

        //Make Appointment  --> - Appointment --> Make -->+1 -->A

        WebElement makeapp = driver.findElement(By.xpath("//a[text()='Make Appointment' and contains(@id,'btn-make-appointment')]"));
        makeapp.click();

        driver.close();


    }
}
