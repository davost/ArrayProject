package se.lexicon.weekTwoExcercises;

public class TwoDimensionalArray {
    public static void assignTwoDValues() {

        //5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and
        // City. Expected output: France Paris Sweden Stockholm

        String[][] landCity = new String[2][2];

        landCity[0][0] = "Sweden";
        landCity[0][1] = "Stockholm";
        landCity[1][0] = "Germany";
        landCity[1][1] = "Berlin";

        for(int i=0; i<landCity.length; i++) {
            for(int j=0; j<landCity[i].length; j++) {
                System.out.print(landCity[i][j] + " ");

                //Blankline
                if(j == landCity[i].length -1) {
                    System.out.println();
                }
            }
        }




/*
            int [][] numbers = new int[3][3];

            for (int i = 0; i < numbers.length; i++){
                for (int j = 0; j< numbers[i].length ; j++){
                    //numbers[i][j] = 8;
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println(" ");

            }
*/
        }

}

