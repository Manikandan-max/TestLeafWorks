package org.example.Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class AhbiBus {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
        driver.findElement(By.linkText("Tomorrow")).click();
        Thread.sleep(2000);
//        driver.findElement(By.linkText("Search")).click();
        System.out.println(driver.findElement(By.cssSelector("div[id='service-operator-agent-name-1717097040'] h5[class='title']")).getText());
        driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='text-grey']/small[text()='33']")).getText());
        List<WebElement> showseats = driver.findElements(By.xpath("//button[text()='Show Seats']"));
        if (!showseats.isEmpty()) {
            showseats.get(0).click();
        } else {
            System.out.println("No Seats found");
        }
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[contains(text(),'DU4')]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Sirsuri')]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Madiwala')]")).click();

        WebElement seatAndFareDiv = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']"));

        WebElement selectedSeat = driver.findElement(By.xpath("//span[contains(text(), 'Seat Selected')]/span"));
        WebElement busFare = driver.findElement(By.xpath("//span[contains(text(), 'Base Fare')]/span"));

        String selectedSeatDetail = selectedSeat.getText();
        String busFareDetail = busFare.getText();
        System.out.println("Seat Selected: " + selectedSeatDetail);
        System.out.println("Base Fare: " + busFareDetail);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());


    }
}
