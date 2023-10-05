package org.example.week1.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {


    public static void main(String[] args) {
        ChromeDriver driver = null;


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://leaftaps.com/opentaps/control/main");


            driver.findElement(By.id("username")).sendKeys("Demosalesmanager");


            driver.findElement(By.id("password")).sendKeys("crmsfa");


            driver.findElement(By.className("decorativeSubmit")).click();

    }
}
