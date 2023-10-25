package org.example.POMProject.pages;

import org.example.POMProject.base.ProjectSpecificClass;
import org.openqa.selenium.By;

public class LeadsPage extends ProjectSpecificClass {
    public CreateLeadsPage clickCreateLeads(){
        driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLeadsPage();

    }
}
