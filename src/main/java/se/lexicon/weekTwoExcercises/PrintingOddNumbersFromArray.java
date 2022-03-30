package se.lexicon.weekTwoExcercises;

public class PrintingOddNumbersFromArray {

    public static void printOddNumbers() {
        //7. Write a program which will set up an array to hold 10 numbers and print
        //out only the uneven numbers. Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
        int sixNums[] = {1, 2, 4, 7, 9, 12};
        System.out.println("Array: 1 2 4 7 9");
        System.out.print("Odd array: ");
        for (int i = 0;i<sixNums.length;i++) {

            if (sixNums[i] % 2 != 0) {
                System.out.print(sixNums[i] + " ");
            }


        }
    }
}

