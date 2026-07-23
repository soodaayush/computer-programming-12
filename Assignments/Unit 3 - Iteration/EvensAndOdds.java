/****************************
 * EVENS AND ODDS              *
 * AAYUSH SOOD                 *
 * OCTOBER 30, 2025             *
 *                               *
 * PURPOSE: A PROGRAM THAT      *
 * DISPLAYS A RANGE OF EVEN     *
 * OR ODD NUMBERS BASED ON      *
 * USER PREFERENCE              *
 *********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class EvensAndOdds {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR STARTING/ENDING NUMBER, SUM OF NUMBERS IN THE
        // RANGE, AND SCANNER
        int intStartingNumber = 0, intEndingNumber = 0, intCurrentNumber = 0, intNumberSum = 0;
        String strNumberList = "", strEvenOrOdd = "", strFlush = "";

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE PROGRAM AND PROMPT USER FOR STARTING AND ENDING NUMBERS
        System.out.print("Enter a starting number: ");
        intStartingNumber = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Enter an ending number: ");
        intEndingNumber = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Display even or odd numbers?: ");
        strEvenOrOdd = scrInput.nextLine().toUpperCase();

        // LOOP THROUGH RANGE OF EVEN/ODD NUMBERS AND SUM THE NUMBERS
        intCurrentNumber = intStartingNumber;

        do {
            // CHECK IF THE USER REQUESTED ODD OR EVEN NUMBERS
            if (strEvenOrOdd.equals("ODD")) {

                // CHECK IF CURRENT NUMBER IS ODD
                if (intCurrentNumber % 2 != 0) {
                    // ADD THE ODD NUMBERS TOGETHER AND ADD THEM TO
                    // THE TOTAL SUM
                    intNumberSum += intCurrentNumber;

                    // ADD COMMAS TO SEPARATE THE NUMBERS, WITH THE
                    // EXCEPTION OF THE FIRST AND LAST NUMBER
                    if (strNumberList.length() > 0) {
                        strNumberList = strNumberList + ", ";
                    }

                    // ADD THE CURRENT NUMBER TO THE STRING LIST
                    strNumberList = strNumberList + intCurrentNumber;

                    // MOVE TO THE NEXT ODD NUMBER IN THE SEQUENCE
                    intCurrentNumber += 2;
                } else {
                    // INCREMENT THE CURRENT NUMBER BY 1 UNTIL AN
                    // ODD NUMBER IS FOUND
                    intCurrentNumber += 1;
                }
            } else if (strEvenOrOdd.equals("EVEN")) {
                // CHECK IF NUMBER IS EVEN
                if (intCurrentNumber % 2 == 0) {
                    // ADD THE EVEN NUMBERS TOGETHER AND ADD THEM
                    // TO THE TOTAL SUM
                    intNumberSum += intCurrentNumber;

                    // ADD COMMAS TO SEPARATE THE NUMBERS, WITH THE
                    // EXCEPTION OF THE FIRST AND LAST NUMBER
                    if (strNumberList.length() > 0) {
                        strNumberList = strNumberList + ", ";
                    }

                    // ADD THE CURRENT NUMBER TO THE STRING LIST
                    strNumberList = strNumberList + intCurrentNumber;

                    // MOVE TO THE NEXT EVEN NUMBER IN THE SEQUENCE
                    intCurrentNumber += 2;
                } else {
                    // INCREMENT THE CURRENT NUMBER BY 1 UNTIL AN
                    // EVEN NUMBER IS FOUND
                    intCurrentNumber += 1;
                }
            }
        } while ((intCurrentNumber <= intEndingNumber) && (strEvenOrOdd.equals("EVEN") || strEvenOrOdd.equals("ODD")));
        // RUN LOOP WHILE THE CURRENT NUMBER IS LESS THAN OR EQUAL TO
        // THE ENDING NUMBER, AS WELL AS MAKING SURE THE USER ENTERED
        // "EVEN" OR "ODD" CORRECTLY

        // OUTPUT NUMBER LIST AND SUM OF ALL NUMBERS
        if (strEvenOrOdd.equals("ODD")) {
            System.out.println("Sum of odd numbers in the range = " + intNumberSum);
            System.out.println("Odd numbers in the range " + intStartingNumber + " to " + intEndingNumber + ": " + strNumberList);
        } else if (strEvenOrOdd.equals("EVEN")) {
            System.out.println("Sum of even numbers in the range = " + intNumberSum);
            System.out.println("Even numbers in the range " + intStartingNumber + " to " + intEndingNumber + ": " + strNumberList);
        } else {
            // OUTPUT A MESSAGE IF THE USER ENTERS AN OPTION OTHER THAN
            // "EVEN" OR "ODD"
            System.out.println("Please fill out the questions properly!");
        }
    }
}
