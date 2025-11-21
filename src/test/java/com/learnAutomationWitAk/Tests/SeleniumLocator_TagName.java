package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumLocator_TagName {


    @Test
    public void run() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");


        //<button type="button"
        // class="btn btn--link btn--primary Fz(12px)"
        // onclick="login.gotoForgotPasswordView()"
        // data-qa="juvuwepeyi"
        // vwo-html-translate="login:forgotPassword">Forgot Password?</button>

        Thread.sleep(2000);

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        //<input type="email"
        // class="text-input login-email-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="forgot-password-username"
        // data-qa="barupusura"
        // placeholder="Enter email ID"
        // data-gtm-form-interact-field-id="0">

        WebElement textbox = driver.findElement(By.id("forgot-password-username"));
        textbox.sendKeys("dshbshbf");


        //<span class="invalid-reason"
        // data-qa="salotanoje"
        // vwo-html-translate="login:invalidEmail">Invalid email</span>
        WebElement error = driver.findElement(By.className("invalid-reason"));

        Thread.sleep(2000);
        Assert.assertEquals(error.getText(),"Invalid email");






    }



}
