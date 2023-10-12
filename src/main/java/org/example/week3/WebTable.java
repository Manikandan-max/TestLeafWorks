package org.example.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.leafground.com/dashboard.xhtml");

        WebElement table= driver.findElement(By.xpath("//table[@role='grid']"));

        List<WebElement> row=table.findElements(By.tagName("tr"));

        List<WebElement> column=table.findElements(By.tagName("th"));
        for (WebElement colValues : column) {
            System.out.println(colValues.getText());
        }
        for (int i=1;i<= column.size();i++
             ) {
            String rowValues=driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table/tbody/tr[1]/td["+i+"]")).getText();
            System.out.println(rowValues);

        }
    }
}
