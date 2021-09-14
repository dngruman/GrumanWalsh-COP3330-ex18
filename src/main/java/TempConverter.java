/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        char Choice;
        double Temp, Ans;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        Choice = user_input.next().toUpperCase().charAt(0);

        if (Choice == 'C') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Temp = user_input.nextDouble();
            Ans = (Temp - 32) / 1.8;
            System.out.print("The temperature in Celsius is " +Ans+ ".");
        }

        if (Choice == 'F'){
            System.out.print("Please enter the temperature in Celsius: ");
            Temp = user_input.nextDouble();
            Ans = (Temp * 1.8) + 32;
            System.out.println("The temperature in Fahrenheit is " +Ans+ ".");
        }
        else{
            System.out.print(Choice+ " is an invalid choice.");
        }
    }
}


