package se.lexicon.weekOneExercises;

public class Time {
    public static void counter() {

        /*
        7. Create a program that converts seconds to hours, minutes and seconds
        Input seconds: 86399
        Expected output:
        23:59:59
        */

        int inputSeconds = 86399;
        int hours = inputSeconds / 3600;
        int remainder = inputSeconds % 3600;

        int minutes = remainder / 60;
        int nextRemainder = remainder % 60;

        int seconds = nextRemainder;

        System.out.println(hours + ":" + minutes + ":" + seconds);
        //new committ
    }
}