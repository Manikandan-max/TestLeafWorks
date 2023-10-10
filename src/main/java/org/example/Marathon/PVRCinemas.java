package org.example.Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class PVRCinemas {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.pvrcinemas.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
        driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
        Thread.sleep(5000);
        WebElement selectCity = driver.findElement(By.xpath("//select[@name='city']"));
        Select city = new Select(selectCity);
        city.selectByVisibleText("Chennai");
        WebElement selectGenre = driver.findElement(By.xpath("//select[@name='genre']"));
        Select genre = new Select(selectGenre);
        genre.selectByVisibleText("ANIMATION");
        WebElement selectLanguage = driver.findElement(By.xpath("//select[@name='lang']"));
        Select lang = new Select(selectLanguage);
        lang.selectByVisibleText("ENGLISH");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='movie-list']//div[@class='movie-wrapper ng-star-inserted'][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
        Thread.sleep(5000);
        WebElement cinemaHall = driver.findElement(By.xpath("//select[@id='cinemaName']"));
        Select cinema = new Select(cinemaHall);
        cinema.selectByValue("PVR Theyagaraja Thiruvanmiyur Chennai");
        driver.findElement(By.xpath("//span[text()='16']")).click();

        WebElement preferredTime = driver.findElement(By.xpath("//select[@name='timings']"));
        Select timeSlot = new Select(preferredTime);
        timeSlot.selectByVisibleText("12:00 PM - 03:00 PM");

        driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("King");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kingmaker12@gmail.com");
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543212");
        WebElement foodRequirements = driver.findElement(By.xpath("//select[@name='food']"));
        Select food = new Select(foodRequirements);
        food.selectByVisibleText("No");
        driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Nothing BUt Good Movie");
        driver.findElement(By.xpath("//input[@id='copySelf']")).click();
        driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.already-member'")).click();
        System.out.println(driver.getTitle());
    }
}
