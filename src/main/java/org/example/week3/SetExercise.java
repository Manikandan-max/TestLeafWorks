package org.example.week3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=scanner.next();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            set.add(c);
        }
        System.out.println("Unique Characters in given string: ");
        for (char cs: set){
            System.out.println(cs);
        }
    }
}
