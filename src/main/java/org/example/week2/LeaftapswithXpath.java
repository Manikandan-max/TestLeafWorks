package org.example.week2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeaftapswithXpath {
    private static final Logger logger = LoggerFactory.getLogger(LeaftapswithXpath.class);
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="http://leaftaps.com/opentaps/control/main";
        driver.get(url);
        logger.info("URL details :{} ",url);
        WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        String usernameValue = "Demosalesmanager";
        userName.sendKeys(usernameValue);
        logger.info("Username:{}",usernameValue);
        WebElement password=driver.findElement(By.xpath("//input[@name='PASSWORD']"));
        String passwordValue="crmsfa";
                password.sendKeys(passwordValue);
        logger.info("Password: {}",passwordValue);
        driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
        logger.info("Login Button Clicked");
    }
}
