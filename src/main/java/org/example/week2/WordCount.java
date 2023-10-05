package org.example.week2;

public class WordCount {
    public static void main(String[] args) {
        String s="Selenium Webdriver Course";
        String[] words=s.split("\\s+");
        int count=words.length;
        System.out.println(count);


    }
}
