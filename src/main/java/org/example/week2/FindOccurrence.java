package org.example.week2;

import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        String s="TestLeaf";
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Target Element: ");
        String targetValue= scan.next();
        char[] charArray = s.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if (charArray[i]==targetValue.charAt(0)){
                count+=1;
            }

        }
        System.out.println("Number of Occurrences:"+count);
    }
}
