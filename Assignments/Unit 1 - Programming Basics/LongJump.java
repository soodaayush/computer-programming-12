/*******************************************
 * LONG JUMP CALCULATOR                     *
 * AAYUSH SOOD                              *
 * SEPTEMBER 15, 2025                       *
 *                                           *
 * PURPOSE: THIS PROGRAM TAKES              *
 * YOUR PET FROG'S FOUR BEST                *
 * JUMPING DISTANCES, AND                   *
 * CALCULATES ITS AVERAGE JUMP              *
 * DISTANCE                                 *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class LongJump {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES
        double dblFirstJumpDistance;
        double dblSecondJumpDistance;
        double dblThirdJumpDistance;
        double dblFourthJumpDistance;

        String strParticipantName;
        String strFlush = "";

        double dblAverageJumpDistance;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR JUMP DISTANCES
        System.out.println("Data Record Sheet:");

        System.out.print("\nEnter jump 1 distance: ");
        dblFirstJumpDistance = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Enter jump 2 distance: ");
        dblSecondJumpDistance = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Enter jump 3 distance: ");
        dblThirdJumpDistance = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Enter jump 4 distance: ");
        dblFourthJumpDistance = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("\nEnter the name of the participant: ");
        strParticipantName = scrInput.nextLine();

        // PERFORM AVERAGE DISTANCE CALCULATIONS
        dblAverageJumpDistance = (dblFirstJumpDistance + dblSecondJumpDistance + dblThirdJumpDistance + dblFourthJumpDistance) / 4;

        // OUTPUT AVERAGE DISTANCE
        System.out.println("\nWow! " + strParticipantName + " had an average jump distance of " + dblAverageJumpDistance + " cm!");
    }
}
