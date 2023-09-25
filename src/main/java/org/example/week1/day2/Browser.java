package org.example.week1.day2;

public class Browser {
    public void launchbrowser(String browserName){
        System.out.println("Launching the browser:"+browserName);
    }
    public void loadUrl(){
        System.out.println("Application loaded Successfully");
    }

    public static void main(String[] args) {
        Browser browser=new Browser();
        browser.launchbrowser("Chrome");
        browser.loadUrl();

    }
}
