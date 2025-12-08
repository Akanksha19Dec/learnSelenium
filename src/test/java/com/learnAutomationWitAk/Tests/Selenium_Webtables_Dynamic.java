package com.learnAutomationWitAk.Tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_Webtables_Dynamic {

    @Description("This is a dynamic webtable")
    @Test
    public  void task1()
    {//Print all the cell values from dynamic table https://awesomeqa.com/webtable1.html

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table= driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
          List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++)
        {
        List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
         for(WebElement col : columns)
            {
                System.out.println(col.getText());
            }
        }

          driver.close();
    }
}
