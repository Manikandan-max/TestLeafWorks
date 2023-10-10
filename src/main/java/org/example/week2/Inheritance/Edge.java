package org.example.week2.Inheritance;

public class Edge extends Browsers{
    public Edge(String browserName, String browserVersion) {
        super(browserName, browserVersion);
    }
    public void takeSnap(){
        System.out.println("Snap taken");

    }
    public void clearCookies(){
        System.out.println("Cookies Cleared");
    }

    public static void main(String[] args) {
        Edge edge=new Edge("Edge","101");
        edge.openUrl();
        edge.takeSnap();
        edge.navigateBack();
        edge.closeBrowser();
        edge.clearCookies();
    }
}
