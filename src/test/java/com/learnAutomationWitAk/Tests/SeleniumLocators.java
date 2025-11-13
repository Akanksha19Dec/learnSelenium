package com.learnAutomationWitAk.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SeleniumLocators {


    //Enter wrong usename



    //Click on sign in button

    //Validate that the error message is visible


    @Test
    public void test1() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");

        //Enter wrong username
        //<input type="email"
        // class="text-input W(80%)"   No we can't use class name
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID">

//WebElement element = driver.findElement(By.id("login-username"));
WebElement username = driver.findElement(By.name("username"));

        username.sendKeys("admin@fdjfn.com");
        //Enter wrong password

        //<input type="password"
        // class="text-input W(100%)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password">


        //WebElement element = driver.findElement(By.id("login-password"));
        WebElement password = driver.findElement(By.name("password"));

        password.sendKeys("13u213u");


        //Click on sign in button


        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(8px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica">
        // <span class="icon loader hidden"
        // data-qa="zuyezasugu">
        // </span>
        // <span data-qa="ezazsuguuy"
        // vwo-html-translate="login:signIn">Sign in</span>
        // </button>


        //WebElement element = driver.findElement(By.id("login-password"));
        WebElement button = driver.findElement(By.id("js-login-btn"));

      button.click();

      Thread.sleep(30000);
        //Validate that the error message is visible


     // <div class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match
        // </div>



       // WebElement textBox = driver.findElement(By.id("js-notification-box-msg"));
        WebElement textBox = driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(textBox.getText(),"Your email, password, IP address or location did not match");;




    }
}
