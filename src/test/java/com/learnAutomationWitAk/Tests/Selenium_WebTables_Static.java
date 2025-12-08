package com.learnAutomationWitAk.Tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_WebTables_Static {

    @Description("this is a static web table")

    @Test
    public void task1() {
        //Print all the values from the static table :
        //https://awesomeqa.com/webtable.html

        //Google
        //Maria Anders
        // Germany

        //Meta
        //Francisco Chang
        //Mexico ...
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/webtable.html");
//Row 1

        //headers


        //Row 2
        // table[@id="customers"]/tbody/tr[2]/td[1] -->Goggle
        // table[@id="customers"]/tbody/tr[2]/td[2] --> Maria Anders
        // table[@id="customers"]/tbody/tr[2]/td[3] --> Germany
//Common -->   // table[@id="customers"]/tbody/tr[2]

        //Row 3
        //table[@id="customers"]/tbody/tr[3]/td[1] -->Meta
        // table[@id="customers"]/tbody/tr[3]/td[2] --> Maria Anders
        // table[@id="customers"]/tbody/tr[3]/td[3] --> Mexico
//Common -->  // table[@id="customers"]/tbody/tr[3]


        String firstpart = "// table[@id=\"customers\"]/tbody/tr[";
        //i=2
        String secondpart = "]/td[";
        //j=1
        String thirdpart = "]";
        String static_value_xpath;


        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                static_value_xpath = firstpart + i + secondpart + j + thirdpart; //"// table[@id=\"customers\"]/tbody/tr[2]/td[1];
                System.out.println(driver.findElement(By.xpath(static_value_xpath)).getText());

            }
        }

        driver.close();
    }


    @Test
    public void task2() {
        //Only print the company and country if the employee is Yoshi Tannamuri
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/webtable.html");
//Row 1

        //headers


        //Row 2
        // table[@id="customers"]/tbody/tr[2]/td[1] -->Goggle
        // table[@id="customers"]/tbody/tr[2]/td[2] --> Maria Anders
        // table[@id="customers"]/tbody/tr[2]/td[3] --> Germany
//Common -->   // table[@id="customers"]/tbody/tr[2]

        //Row 3
        //table[@id="customers"]/tbody/tr[3]/td[1] -->Meta
        // table[@id="customers"]/tbody/tr[3]/td[2] --> Maria Anders
        // table[@id="customers"]/tbody/tr[3]/td[3] --> Mexico
//Common -->  // table[@id="customers"]/tbody/tr[3]


        String firstpart = "// table[@id=\"customers\"]/tbody/tr[";
        //i=2
        String secondpart = "]/td[";
        //j=1
        String thirdpart = "]";
        String static_value_xpath;
        String value;

        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();


        System.out.println("Rows are " + rows);
        System.out.println("colums are " + col);

        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                static_value_xpath = firstpart + i + secondpart + j + thirdpart; //"// table[@id=\"customers\"]/tbody/tr[2]/td[1];
                value = driver.findElement(By.xpath(static_value_xpath)).getText();
                if (value.equalsIgnoreCase("Yoshi Tannamuri")) {
                    System.out.println("Name is " + value);
                    String company = driver.findElement(By.xpath(static_value_xpath + "/preceding-sibling::td")).getText();
                    System.out.println("Company is " + company);
                    String country = driver.findElement(By.xpath(static_value_xpath + "/following-sibling::td")).getText();
                    System.out.println("Country is " + country);

                }
            }
        }
        driver.close();
    }
}