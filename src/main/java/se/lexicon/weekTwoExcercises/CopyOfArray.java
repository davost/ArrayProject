package se.lexicon.weekTwoExcercises;
import java.util.Arrays;
public class CopyOfArray {

    public static void copyingArray() {

        //4. Write a program which will copy the elements of one array into another array.
        //Expected output: Elements from first array: 1 15 20 / Elements from second array: 1 15 20

        int[] firstArray = {1, 15, 20};
        int[] secondArray = Arrays.copyOf(firstArray, 3);

        for (int num : firstArray) {
            System.out.print(num);
            System.out.print(" ");
        }

            //print line for spacing between first and second output
            System.out.println("");

        for (int num2 : secondArray) {
            System.out.print(num2);
            System.out.print(" ");
        }
    }
}
/*
int[] array1 = {1,2,3,4};
int[] array2 = Arrays.copyOf(array1, 3);
for(int number : array2) {
System.out.println(number);
}

 */