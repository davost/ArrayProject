package se.lexicon.weekTwoExcercises;

import java.math.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayAverage {
    public static void findAverage() {
        //6. Write a program which will set up an array to hold the next values in this
        //order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        //Expected output: Average is: 17.3

        int[] nums = new int[] {43,5,23,17,2,14};
        double avg = nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5];

        System.out.printf("Value: %.1f", avg / 6);


    }


}
