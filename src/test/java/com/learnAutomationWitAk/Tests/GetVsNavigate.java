package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetVsNavigate {

    @Test
    public void launchBr() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
//     driver.navigate().to("https://www.amazon.com/");//
//     driver.navigate().back();
//     driver.navigate().forward();
//     driver.navigate().refresh();

    if(driver.getPageSource().contains("Shop Holiday xcgg Guides"))
    {
        Assert.assertTrue(true);
        System.out.println("Shop Holiday Gift Guides --> is present");
    }
    else{
      throw new Exception("Shop Holiday Gift Guides is Not present");
    }
     ;

       // driver.close();  // Only close the browser that it has opened
       // close all the open browers

    }

}
