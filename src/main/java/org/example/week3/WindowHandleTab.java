package org.example.week3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandleTab {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.irctc.co.in/nget/");
        //Navigate to Flights
        driver.findElement(By.linkText("FLIGHTS")).click();
        String parentHandle = driver.getWindowHandle();
        switchToNewTab(driver, parentHandle);
        System.out.println("Title: " + driver.getTitle());
        switchToParent(driver, parentHandle);
        driver.close();
    }
    public static String switchToNewTab(ChromeDriver driver, String parentTab) {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> addresses = new ArrayList<>(windowHandles);
        for (String address : addresses
        ) {
            if (!address.equals(parentTab)) {
                driver.switchTo().window(address);
                return address;
            }
        }
        return null;
    }
    public static void switchToParent(ChromeDriver driver, String parentTab) {
        driver.switchTo().window(parentTab);
    }
}
