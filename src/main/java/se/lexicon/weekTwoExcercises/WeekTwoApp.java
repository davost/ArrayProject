package se.lexicon.weekTwoExcercises;

import static java.lang.System.out;
import static se.lexicon.weekTwoExcercises.Arrays.printing;
import static se.lexicon.weekTwoExcercises.IndexOfArray.indexOf;
import static se.lexicon.weekTwoExcercises.SortArray.sorting;
import static se.lexicon.weekTwoExcercises.CopyOfArray.copyingArray;
import static se.lexicon.weekTwoExcercises.TwoDimensionalArray.assignTwoDValues;

public class WeekTwoApp {
    public static void main(String[] args) {
        out.println("Testing arrays");
        out.println("");

        //1. Write a program to store elements in an array of type ‘int’ and print out. Expected output: 11 23 39 etc.
        printing();
        out.println("");

        //2. Create a program and create a method with name ‘indexOf’ which will find and
        // return the index of an element in the array. If the element doesn’t exist your
        // method should return -1 as value. Expect output:Index position of number 5 is: 2.

        indexOf();
        out.println("");

        //3. Write a program which will sort string array. Expected output:
        // String array: [Paris, London, New York, Stockholm]
        // Sort string array: [London, New York, Paris, Stockholm]

        sorting();
        out.println("");

        //4. Write a program which will copy the elements of one array into another array.
        //Expected output: Elements from first array: 1 15 20 / Elements from second array: 1 15 20

        copyingArray();
        out.println("");
        out.println("");

        //5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and
        // City. Expected output: France Paris Sweden Stockholm

        assignTwoDValues();
        out.println("");


    }
}
