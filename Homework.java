package com.company;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // ***Write a function that will print all the divisors of a number N that is passed to that function.***

        System.out.println("To find the divisors of a number, insert a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(" The divisors of "+number+" are: ");

        for (int i=1; i<=number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }

        //  *** Find if a N is prime or not ***
        System.out.println("Find if a number is prime or not, enter a number:");
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();

        if (num<0) {
            System.out.println("Number should not be negative");
        }
        else System.out.println(num + " is a prime number: " + isPrimeNumber(num));
    }

    static boolean isPrimeNumber (int n) {
        for (int i =2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}