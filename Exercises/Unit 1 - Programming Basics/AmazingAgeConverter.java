/*******************************************
 * AMAZING AGE CONVERTER                    *
 * AAYUSH SOOD                              *
 * SEPTEMBER 11, 2025                       *
 *                                           *
 * PURPOSE: A PROGRAM WHERE YOU INPUT       *
 * YOUR AGE, AND YOU ARE PROVIDED THE       *
 * YOU HAVE BEEN ALIVE IN DAYS, HOURS,      *
 * MINUTES, AND SECONDS                     *
 *********************************************/
//---------------------------------------------
import java.util.Scanner;
//---------------------------------------------
public class AmazingAgeConverter {
    public static void main(String args[]) {
        // DECLARE VARIABLES & INITIALIZE
        String strName = "";

        int intAge = 0;
        int intDays = 0;
        int intHours = 0;
        int intMinutes = 0;
        int intSeconds = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // ASK FOR THE USER'S AGE
        System.out.print("Hello, what is your age?: ");
        intAge = scrInput.nextInt();

        //  ASK FOR USER'S NAME
        System.out.print("What is your name?: ");
        strName = scrInput.nextLine();
        strFlush = scrInput.nextLine();

        // PERFORM CALCULATIONS FOR DAYS, HOURS, MINUTES, AND SECONDS
        intDays = intAge * 365;
        intHours = intDays * 24;
        intMinutes = intHours * 60;
        intSeconds = intMinutes * 60;

        // OUTPUT THE CONVERTED AGE
        System.out.println("\n\nHi " + strFlush + ", Your age in: ");
        System.out.println("Days:\t\t" + intDays);
        System.out.println("Hours:\t\t" + intHours);
        System.out.println("Minutes:\t" + intMinutes);
        System.out.println("Seconds:\t" + intSeconds);
    }
}
