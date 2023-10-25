package org.example.POMProject.pages;

import org.example.POMProject.base.ProjectSpecificClass;

public class ViewPage extends ProjectSpecificClass {


    public ViewPage verifyCreateLead(){
        System.out.println(driver.getTitle());
        return new ViewPage();
    }
}
