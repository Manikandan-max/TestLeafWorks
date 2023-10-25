package org.example.POMProject.testcase;

import org.example.POMProject.base.ProjectSpecificClass;
import org.example.POMProject.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadTest extends ProjectSpecificClass {



    @BeforeTest
    public void setFileName() {
        fileName = "CreateLead";
    }

    @Test(dataProvider = "fetchData")
    public void runCreateLeadTest(String cname, String fname, String lname, String email) {

        LoginPage lp = new LoginPage();
        lp.enterUserName().enterPassword().clickLoginButton().clickCRMSFA().clickLeads()
                .clickCreateLeads()
                .enterCompanyName(cname)
                .enterFirstName(fname)
                .enterLastName(lname)
                .enterEmail(email)
                .clickSubmit()
                .verifyCreateLead();

    }
}
