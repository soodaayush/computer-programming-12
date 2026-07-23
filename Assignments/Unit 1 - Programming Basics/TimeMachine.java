/*******************************************
 * THE AMAZING TIME MACHINE                 *
 * AAYUSH SOOD                              *
 * SEPTEMBER 17, 2025                       *
 *                                           *
 * PURPOSE: TO PROMPT THE USER              *
 * FOR A TIME AND MINUTES AND               *
 * CONVERTS THE TIME INTO HOURS             *
 * AND MINUTES                              *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class TimeMachine {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES
        int intInputtedTimeInMinutes, intCalculatedTimeInHours, intCalculatedTimeInMinutes;
        int intFirstMinuteDigit, intSecondMinuteDigit;

        String strFlush = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR TIME IN MINUTES
        System.out.print("Enter the time in minutes: ");
        intInputtedTimeInMinutes = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // CALCULATE HOURS AND MINUTES
        intCalculatedTimeInHours = intInputtedTimeInMinutes / 60;
        intCalculatedTimeInMinutes = intInputtedTimeInMinutes % 60;

        intFirstMinuteDigit = intCalculatedTimeInMinutes / 10;
        intSecondMinuteDigit = intCalculatedTimeInMinutes % 10;

        // OUTPUT HOURS AND MINUTES
        System.out.print("The time is: ");
        System.out.print(intCalculatedTimeInHours + ":" + intFirstMinuteDigit + intSecondMinuteDigit);
    }
}
