package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class GetTitle {

    @Test
    public void run1()
    {
       // System.getProperties("/C:/Doucment/ChromeDriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //ChromeDrive class is loaded in JVM
        //instance of driver created
        //A NEW object is created in the java heap space
        //An api POST request is made to the chrome driver which is active on an 1234 port and it is sent to an endpoint "/seesion"
        //in response you'll get a session id which is the unique instance of that particular browser sessio

       driver.get("https://www.w3schools.com/html/default.asp");
       driver.manage().window().maximize();
       assertThat(driver.getTitle()).contains("HTML");
    }

}
