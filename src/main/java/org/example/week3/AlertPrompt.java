package org.example.week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPrompt {

    public static String acceptAlert(ChromeDriver driver){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Legend");
        alert.accept();
        return driver.findElement(By.xpath("(//span[@id='confirm_result'])[1]")).getText();
    }
    public static String dismissAlert(ChromeDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Legend");
        alert.dismiss();
        return driver.findElement(By.xpath("(//span[@id='confirm_result'])[1]")).getText();
    }
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leafground.com/alert.xhtml");

        //Accept
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        String acceptResult=acceptAlert(driver);
        System.out.println("Result of AcceptPrompt: "+acceptResult);
        //Dismiss
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        String dismissResult=dismissAlert(driver);
        System.out.println("Result of DismissPrompt: "+dismissResult);
        driver.quit();

    }
}
