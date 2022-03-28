package se.lexicon.weekOneExercises;

import java.util.Scanner;

public class InputName {
    public static void input() {
        /*
         5. Create a program that asks user to input his/her name and store it in a
        variable instead of having fixed name. Then print ‘Hello username’ where
        username is what you got from user as input.
        */

        Scanner sc = new Scanner(System.in);

        //get user name ad store in variable

        System.out.println("Please enter your first name and then press enter");
        String userName = sc.next();

        //print user name

        System.out.println("Hello " + userName);
        //new committ

    }
}