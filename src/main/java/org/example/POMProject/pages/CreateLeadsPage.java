package org.example.POMProject.pages;

import org.example.POMProject.base.ProjectSpecificClass;
import org.openqa.selenium.By;

public class CreateLeadsPage extends ProjectSpecificClass {


    public CreateLeadsPage enterCompanyName(String cname) {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
        return new CreateLeadsPage();
    }

    public CreateLeadsPage enterFirstName(String fname) {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
        return new CreateLeadsPage();

    }

    public CreateLeadsPage enterLastName(String lname) {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
        return new CreateLeadsPage();
    }

    public CreateLeadsPage enterEmail(String email) {
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
        return new CreateLeadsPage();

    }
    public ViewPage clickSubmit(){
        driver.findElement(By.name("submitButton")).click();
        return new ViewPage();
    }

}
