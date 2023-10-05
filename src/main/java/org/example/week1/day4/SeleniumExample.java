package org.example.week1.day4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumExample {
    private static final Logger logger = LoggerFactory.getLogger(SeleniumExample.class);

    public static void main(String[] args) {


        ChromeDriver driver = null;
        try {
            // Initialize WebDriver


            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Navigate to the URL
            String url = "http://leaftaps.com/opentaps/control/main";
            driver.get(url);
            logger.info("Navigated to URL: {}", url);

            // Find and interact with web elements
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("Demosalesmanager");
            logger.info("Entered username: Demosalesmanager");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("crmsfa");
            logger.info("Entered password: crmsfa");

            WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
            loginButton.click();
            logger.info("Clicked on login button");

            WebElement headingElement = driver.findElement(By.tagName("h2"));
            String headingText = headingElement.getText();
            logger.info("Heading Text: {}", headingText);

            WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
            crmSfaLink.click();
            logger.info("Clicked on CRM/SFA link");

            String pageTitle = driver.getTitle();
            logger.info("Web Application Title: {}", pageTitle);
        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
            logger.info("Browser closed");
        }
    }
}
