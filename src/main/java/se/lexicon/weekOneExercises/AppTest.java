package se.lexicon.weekOneExercises;


import static se.lexicon.weekOneExercises.Averages.average;
import static se.lexicon.weekOneExercises.Hello.hello;
import static se.lexicon.weekOneExercises.InputName.input;
import static se.lexicon.weekOneExercises.InputNumbers.inputNum;
import static se.lexicon.weekOneExercises.LeapYear.leap;
import static se.lexicon.weekOneExercises.SumMultDiv.math;
import static se.lexicon.weekOneExercises.Time.counter;

public class AppTest {
        public static void main(String[] args) {
        System.out.println("Hello Java!");

        //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("-------------------");
        System.out.println("Hello exercise output:");

        hello();

        //2. Create a program that takes a year as input from user and print if it’s leap year or not.
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Leap year exercise:");

        leap();

        //3. Write a Java program to print the sum/multiplication/division and subtraction of two numbers

        System.out.println();
        System.out.println("-------------------");
        System.out.println("sum, multiplication, division exercise:");

        math();

        //4. Write a Java program that prints the average of three numbers Expected result: (23 + 11 + 77) / 3 = 37

        System.out.println();
        System.out.println("-------------------");
        System.out.println("average exercise:");

        average();

        /*
        5. Create a program that asks user to input his/her name and store it in a
        variable instead of having fixed name. Then print ‘Hello username’ where
        username is what you got from user as input.
        */

        System.out.println();
        System.out.println("-------------------");
        System.out.println("input name exercise:");

        input();

        //6. Create a program that asks user to input two numbers / print the sum/multiplication/division and subtraction of given numbers

        System.out.println();
        System.out.println("-------------------");
        System.out.println("input numbers exercise:");

        inputNum();

        //7. Create a program that converts seconds to hours, minutes and seconds

        System.out.println();
        System.out.println("-------------------");
        System.out.println("time exercise:");

        counter();

        //new commit
       }

}
