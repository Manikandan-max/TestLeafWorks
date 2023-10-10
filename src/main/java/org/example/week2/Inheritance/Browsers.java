package org.example.week2.Inheritance;

public class Browsers {
    private String browserName;
    private String browserVersion;

    public void openUrl(){
        String message = String.format("Url Opened %s %s", browserName, browserVersion);
        System.out.println(message);
    }
    public void closeBrowser(){
        System.out.println("Browser Closed :"+ browserName);
    }
    public void navigateBack(){
        System.out.println("Navigating back to the site");
    }

    public Browsers(String browserName, String browserVersion) {
        this.browserName = browserName;
        this.browserVersion = browserVersion;
    }

    public static void main(String[] args) {
        Browsers browser=new Browsers("Safari","202.01");
        browser.openUrl();
        browser.navigateBack();
        browser.closeBrowser();


    }
}
