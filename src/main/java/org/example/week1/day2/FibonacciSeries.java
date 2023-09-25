package org.example.week1.day2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        long firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < numTerms; i++) {
            long nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
