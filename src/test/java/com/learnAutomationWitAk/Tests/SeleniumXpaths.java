package com.learnAutomationWitAk.Tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumXpaths {

    @Description("Relative Xpaths")
    @Test
    public void test1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");


        //Find the relative xpath of the username in app vwo
        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID" data-gtm-form-interact-field-id="0">

//input[@type="email"] -- 4
//input[@vwo-html-translate-placeholder="login:enterEmailID"] -- 4
        //input[@id="login-username"] --- 1
      // WebElement username= driver.findElement(By.xpath("//input[@data-qa='hocewoqisi']")) ; This is working

         WebElement username= driver.findElement(By.xpath("//input[@placeholder='Enter email ID']")) ;

        username.sendKeys("sbjsad");
        //input[@placeholder="Enter email ID"]--4

//<input type="password" class="text-input W(100%)" vwo-html-translate-attr="placeholder" vwo-html-translate-placeholder="login:enterPassword" name="password" id="login-password" data-qa="jobodapuxe" placeholder="Enter password">
        //WebElement password= driver.findElement(By.xpath("//input[@data-qa='jobodapuxe']")) ; This is working
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Enter password']")) ;

        password.sendKeys("ncbsjcbdsj");
       // <button type="submit" id="js-login-btn" class="btn btn--primary btn--inverted W(100%) Mb(8px) Mb(0):lc" onclick="login.login(event)" data-qa="sibequkica"> <span class="icon loader hidden" data-qa="zuyezasugu"></span> <span data-qa="ezazsuguuy" vwo-html-translate="login:signIn">Sign in</span> </button>

        //        WebElement button= driver.findElement(By.xpath("//button[@data-qa='sibequkica']")) ;This is working
        WebElement button= driver.findElement(By.xpath("//button[@onclick='login.login(event)']")) ;
        button.click();

        Thread.sleep(30000);

       // WebElement errormsg = driver.findElement(By.xpath("//div[@data-qa='rixawilomi']"));This is working

         WebElement errormsg = driver.findElement(By.xpath("//div[@class='notification-box-description']"));

        Assert.assertEquals(errormsg.getText(),"Your email, password, IP address or location did not match");

driver.close();

    }


}
