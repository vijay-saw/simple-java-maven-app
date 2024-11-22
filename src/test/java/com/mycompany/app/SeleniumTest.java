package com.mycompany.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // Set up WebDriverManager to manage the ChromeDriver binary
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testGooglePage() {
        // Open Google and check the page title
        driver.get("https://www.google.com");
        System.out.println("Page Title is: " + driver.getTitle());

        // Test assertion (this can be expanded for actual validation)
        assert driver.getTitle().contains("Google");

        // Close the browser after the test
        driver.quit();
    }
}
