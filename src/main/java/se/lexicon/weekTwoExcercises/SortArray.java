package se.lexicon.weekTwoExcercises;
import java.util.Arrays;
public class SortArray {

    public static void sorting() {

        //3. Write a program which will sort string array. Expected output: String array: [Paris, London, New York, Stockholm]
        // Sort string array: [London, New York, Paris, Stockholm]

        String[] cityNames = {"Paris, ", "London, ", "New York, ", "Stockholm"};

        for (String city : cityNames)
            System.out.print(city);
            System.out.println("");

        Arrays.sort(cityNames);
        for (String city : cityNames) {
            System.out.print(city);

        }
            System.out.println("");
      /*
 String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
    //Arrays.sort(names);
    Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

    for (String name : names) {
      System.out.println(name);
 */




    }
}
