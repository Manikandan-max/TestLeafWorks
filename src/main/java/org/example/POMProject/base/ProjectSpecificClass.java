package org.example.POMProject.base;

import org.example.POMProject.utils.ReadExcel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.time.Duration;

public class ProjectSpecificClass {

    public static ChromeDriver driver;
    public String fileName;



    @BeforeMethod
    public void openBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
    @DataProvider(name = "fetchData", indices = { 1 }) // to choose the rows to be executed
    public Object[][] sendData() throws IOException {
        String[][] data = ReadExcel.readData(fileName);
        return data;
    }
}
