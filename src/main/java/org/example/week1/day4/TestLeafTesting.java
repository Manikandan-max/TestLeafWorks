package org.example.week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafTesting {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // Get the Url
        driver.get("http://leaftaps.com/opentaps/control/main");

        //Username
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        //Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        //Login
        driver.findElement(By.className("decorativeSubmit")).click();
        //Getting the Heading
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        //Login to CRM
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Getting the Title of Web Application
        System.out.println(driver.getTitle());

        //Close
        driver.close();

    }
}
