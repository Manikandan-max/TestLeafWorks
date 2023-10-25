package org.example.POMProject.pages;

import org.example.POMProject.base.ProjectSpecificClass;
import org.openqa.selenium.By;

public class WelcomePage extends ProjectSpecificClass {


    public HomePage clickCRMSFA(){
        driver.findElement(By.linkText("CRM/SFA")).click();
        return new HomePage();
    }
    public LoginPage clickLogout(){
        driver.findElement(By.className("decorativeSubmit")).click();
        return new LoginPage();

    }
}
