package se.lexicon.weekTwoExcercises;

import static java.lang.System.out;
import static se.lexicon.weekTwoExcercises.Arrays.printing;
import static se.lexicon.weekTwoExcercises.IndexOfArray.indexOf;
import static se.lexicon.weekTwoExcercises.SortArray.sorting;
import static se.lexicon.weekTwoExcercises.SortArray.*;
public class WeekTwoApp {
    public static void main(String[] args) {
        out.println("Testing arrays");

        //1. Write a program to store elements in an array of type ‘int’ and print out. Expected output: 11 23 39 etc.
        printing();

        //2. Create a program and create a method with name ‘indexOf’ which will find and
        // return the index of an element in the array. If the element doesn’t exist your
        // method should return -1 as value. Expect output:Index position of number 5 is: 2.

        indexOf();

        //3. Write a program which will sort string array. Expected output:
        // String array: [Paris, London, New York, Stockholm]
        // Sort string array: [London, New York, Paris, Stockholm]

        sorting();

    }
}
