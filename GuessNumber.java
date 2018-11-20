package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random r = new Random();
        int random = r.nextInt(30)+1;
       System.out.println("A random number from 1 to 30 is: " + random);

        System.out.println("Guess the random nr:  ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int answer=random;

        if (number==answer) {
            System.out.println("Right!");
            return;
        } else
            System.out.println("Sorry...you're wrong,");

        if (number < answer) System.out.println("too low.");
        else System.out.println("too high.");
    }
}
