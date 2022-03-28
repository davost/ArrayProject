package se.lexicon.weekOneExercises;

import java.util.Scanner;

public class InputNumbers {
    public static void  inputNum() {
        //6. Create a program that asks user to input two numbers / print sum/multiplication/division and subtraction of given numbers

        Scanner scan = new Scanner(System.in);

        //ask the user to enter two numbers to be stored in variables

        System.out.println("Please enter a number and then press enter");
        double firstNum = scan.nextDouble();

        System.out.println("Please enter a second number and then press enter.");
        double secondNum = scan.nextDouble();

        //use the numbers in math equations and store as variables

        double inputSum = firstNum + secondNum;
        double inputMult = firstNum * secondNum;
        double inputDiv = firstNum / secondNum;
        double inputSub = firstNum - secondNum;

        //inform the user that the numbers will be used to perform math operations and print the results

        System.out.println("The numbers you entered will be used in math equations.");
        System.out.println(firstNum + " + " + secondNum + " = " + inputSum);
        System.out.println(firstNum + " * " + secondNum + " = " + inputMult);
        System.out.println(firstNum + " / " + secondNum + " = " + inputDiv);
        System.out.println(firstNum + " - " + secondNum + " = " + inputSub);
        //new committ
    }
}