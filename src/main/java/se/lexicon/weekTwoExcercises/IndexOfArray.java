package se.lexicon.weekTwoExcercises;
import java.util.Arrays;
public class IndexOfArray {
    public static void indexOf() {

    //2. Create a program and create a method with name ‘indexOf’ which will find and
    // return the index of an element in the array. If the element doesn’t exist your
    // method should return -1 as value. Expect output:Index position of number 5 is: 2.

    int[] indexedNums = {21, 15, 5, 4};
    int index = Arrays.binarySearch(indexedNums, 5);

    if (index == 2) {
        System.out.println("Index position of number 5 is: " + indexedNums[index]);
    } else {
        System.out.println("-5");
    }
    }
}
