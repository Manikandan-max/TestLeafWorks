package org.example.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonXpath {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
       WebElement searchElement= driver.findElement(By.id("twotabsearchtextbox"));
       searchElement.sendKeys("phones");
       searchElement.submit();
        List<WebElement> priceList=driver.findElements(By.cssSelector("span[class='a-price-whole']"));
        List<Integer> prices=new ArrayList<>();
        for (WebElement price:priceList){
            String priceText = price.getText().replace(",", "");
            int priceElement = Integer.parseInt(priceText);
            prices.add(priceElement);
        }
        Collections.sort(prices);
        int lowestPrice = prices.get(0);
        System.out.println(prices);
        System.out.println("Lowest Phone Price: INR " + lowestPrice);
        driver.quit();



    }
}
