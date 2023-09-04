package com.campusdual;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("--> ");
        int userNum = scanner.nextInt();

        int otherNumber = 5;

        if (userNum > 0) {
            System.out.println("Is positive.");
        } else if (userNum < 0) {
            System.out.println("Is negative.");
        } else {
            System.out.println("Is cero.");
        }

        if (userNum % otherNumber == 0) {
            System.out.println("Is multiple of " + otherNumber);
        } else {
            System.out.println("Is not multiple of " + otherNumber);
        }

        if (userNum < otherNumber) {
            System.out.println("The number is less than " + otherNumber);
        } else if (userNum > otherNumber) {
            System.out.println("The number is greater than " + otherNumber);
        } else {
            System.out.println("The number is equal than " + otherNumber);
        }

        scanner.close();
    }
}
