package com.learnAutomationWitAk.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class GetTitle {

    @Test
    public void run1()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        assertThat(driver.getTitle()).contains("VWO");
    }

}
