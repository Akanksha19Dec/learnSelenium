package com.learnAutomationWitAk.Tests;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class SeleniumOptions {

    @Description
    @Test
    public void options()
    {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
      //  options.addArguments("--window-size=1920,1080");
       // options.addArguments("--headless");

        //extensions
  ///add proxy to your server
        Proxy px = new Proxy();
        px.setHttpProxy("18.188.141.177:2080");
        options.setCapability("proxy",px);

        options.addExtensions(new File("C:/Users/akank/OneDrive/Documents/Let'sGetStarted/CRX-Extractor-Downloader-Chrome-Web-Store.crx"));
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.youtube.com");



    }

}
