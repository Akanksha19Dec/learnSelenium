package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumLocators_ClassName {


    @Test
    public void test1()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //Click on Make Appointment

        //<a id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">Make Appointment
        // </a>
        WebElement makeApp = driver.findElement(By.id("btn-make-appointment"));
        makeApp.click();

        //Enter right user name
        // <input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        List<WebElement> username = driver.findElements(By.className("form-control"));
        username.get(2).sendKeys("John Doe");

        // Enter right password

//<input type="password"
// class="form-control"
// id="txt-password"
// name="password"
// placeholder="Password"
// value="" autocomplete="off">

        List<WebElement> password = driver.findElements(By.className("form-control"));
        password.get(3).sendKeys("ThisIsNotAPassword");

//Click on login button

        //<button id="btn-login"
        // type="submit"
        // class="btn btn-default">Login</button>

        WebElement button = driver.findElement(By.className("btn-default"));
       button.click();

        //Verify Make Appointment heading

        //Assert.assertEquals();

    }

}
