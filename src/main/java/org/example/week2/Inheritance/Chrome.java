package org.example.week2.Inheritance;

public class Chrome extends Browsers{
    public Chrome(String browserName, String browserVersion) {
        super(browserName, browserVersion);
    }
    public void openIncognito(){
        System.out.println("Incognito Mode is open");
    }
    public void clearCache(){
        System.out.println("Cache cleared....");
    }

    public static void main(String[] args) {
        Chrome chrome=new Chrome("Chrome","117");
        chrome.openUrl();
        chrome.openIncognito();
        chrome.navigateBack();
        chrome.closeBrowser();
        chrome.clearCache();
    }
}
