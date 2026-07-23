/****************************************
 * MACGYVER                              *
 * AAYUSH SOOD                           *
 * SEPTEMBER 22, 2025                    *
 *                                        *
 * PURPOSE: MAKE A SIMPLE MACGYVER       *
 * BASED RPG                             *
 ******************************************/
//-----------------------------------
import java.util.Scanner;
//-----------------------------------
public class MacGyver {
    public static void main(String args[]) {
        // DEFINE VARIABLES
        Scanner scrInput = new Scanner(System.in);

        String strCutWire = "";

        // SET UP THE GAME
        System.out.println("MacGyver is looking down at a timer");
        System.out.println(".........attached to another bomb");
        System.out.println("Why does this keep happening to him??!!!!??");
        System.out.println("The bomb has wires everywhere!");
        System.out.println("A cold bead of sweat runs down Mac's face");
        System.out.println("There are only 10 seconds left. Which wire");
        System.out.println("should Mac cut?\n\n");

        // LIST THE WIRES MACGYVER SEES
        System.out.println("Green");
        System.out.println("Red");
        System.out.println("Blue");

        // LET USER SELECT THE WIRE TO CUT
        System.out.print("Enter the color for the wire Mac should cut: ");
        strCutWire = scrInput.nextLine();
        strCutWire = strCutWire.toUpperCase();

        // CHECK IF USER MADE THE RIGHT CHOICE
        if (strCutWire.equals("GREEN")) { // GREEN WIRE
            System.out.println("\nThe bomb exploded!!!!!");
        } else if (strCutWire.equals("RED")) { // RED WIRE
            System.out.println("\nThe timer has stopped ticking!!!!!");
            System.out.println("The day has been saved!!!");
        } else if (strCutWire.equals("BLUE")) { // BLUE WIRE
            System.out.println("\nMac looks in horror as the timer goes twice as fast!");
            System.out.println("Quick! Cut another wire!");

            System.out.println("Red");
            System.out.println("Green\n");

            System.out.print("Enter the wire Mac should cut: ");
            strCutWire = scrInput.nextLine(); // Red or Green
            strCutWire = strCutWire.toUpperCase(); // RED OR GREEN

            if (strCutWire.equals("RED")) { // RED WIRE
                System.out.println("Mac cuts the right wire and stops the bomb!");
            } else if (strCutWire.equals("GREEN")) { // GREEN WIRE
                System.out.println("Mac cuts the wrong wire again...RIP");
            } else { // NO WIRE
                System.out.println("That is not an option!");
            }
        } else { // NO WIRE
            System.out.println("\nThe bomb exploded because you fumbled the input!!!!!");
        }
    }
}
