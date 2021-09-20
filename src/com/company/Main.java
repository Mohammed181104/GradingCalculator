package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the total mark");
        int totalMark = input.nextInt();
        System.out.println("What is the mark");
        int studentMark = input.nextInt();
        int percentage = (studentMark / totalMark) * 100;
        if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("C");
        } else if (percentage >= 50) {
            System.out.println("D");
        } else if (percentage >= 40) {
            System.out.println("E");
        } else {
            System.out.println("U");
        }


    }
}