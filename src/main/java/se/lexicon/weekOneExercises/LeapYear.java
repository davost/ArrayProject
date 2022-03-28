package se.lexicon.weekOneExercises;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {

    public static void leap() {
        //2. Create a program that takes a year as input from user and print if it’s leap year or not.

        Scanner scan = new Scanner(System.in);

        //get user input

        System.out.println("Please enter a one to four digit number without a decimal point and then press enter");

        //int inputDate = scan.nextInt();
        int year = scan.nextInt();

        LocalDate givenDate = LocalDate.of(year, 01, 01);
        boolean boolDate = givenDate.isLeapYear();

        if (boolDate) {
            System.out.print("The year that you entered is a leap year. Congratulations!");
        } else {
            System.out.print("The year that you entered is not a leap year.");
        }
        //new committ

    }

}