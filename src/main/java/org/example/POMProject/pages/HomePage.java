package org.example.POMProject.pages;

import org.example.POMProject.base.ProjectSpecificClass;
import org.openqa.selenium.By;

public class HomePage extends ProjectSpecificClass {

    public LeadsPage clickLeads(){
        driver.findElement(By.linkText("Leads")).click();
        return new LeadsPage();

    }
    public void clickAccounts(){}
}
