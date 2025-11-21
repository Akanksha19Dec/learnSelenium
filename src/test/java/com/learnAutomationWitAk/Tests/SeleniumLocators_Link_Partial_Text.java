package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumLocators_Link_Partial_Text {

    //Click on start a free trial
    //Enter invalid email
    //Verify the error message

    //Click on start a free trial

    @Test
    public void task1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");

        //Click on start a free trial --
//<a
// href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
// class="text-link Td(n) Whs(nw)" data-qa="bericafeqo" vwo-html-translate="login:startFreeTrial">
// Start a free trial
// </a>
        //WebElement link = driver.findElement(By.linkText("Start a free trial"));
        WebElement partiallink = driver.findElement(By.partialLinkText("Start a free"));
        partiallink.click();

        //Enter invalid email

        //<input class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="">
        WebElement email = driver.findElement(By.className("input-text"));
        email.sendKeys("sdcnjdsncdsjn");

        //<div
        // class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason"
        // >The email address you entered is incorrect.</div>

        Thread.sleep(2000);

        //    //Verify the error message

        WebElement errormsg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errormsg.getText(),"The email address you entered is incorrect.");

driver.close();







    }



}
