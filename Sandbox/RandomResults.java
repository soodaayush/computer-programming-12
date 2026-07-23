/****************************
 * RANDOM RESULTS           *
 * AAYUSH SOOD              *
 * OCTOBER 27, 2025         *
 *                          *
 * PURPOSE: A PROGRAM WHERE *
 * THE CONTESTANT PICKS A   *
 * RANDOM DOOR AND RECEIVES *
 * A RANDOM PRIZE           *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class RandomResults {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR RANDOM DOOR, ITS CORRESPONDING PRIZE, AND SCANNER
            int intRandomPrize = 0, intDoorNumber = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // LET THE USER PICK A DOOR
            System.out.print("Pick a door: ");
            intDoorNumber = scrInput.nextInt();
            
        // GENERATE A RANDOM PRIZE
            intRandomPrize = (int)((4 - 1 + 1) * Math.random() + 1);
            
        // ASSOCIATE A PRIZE WITH THE RANDOM PRIZE NUMBER
            if (intRandomPrize == 1) {
                System.out.println("You won A Car!");
            } else if (intRandomPrize == 2) {
                System.out.print("You won Old Smelly Socks :(");
            } else if (intRandomPrize == 3) {
                System.out.println("You won $1,000,000!");
            } else if (intRandomPrize == 4) {
                System.out.println("You won Cheese!");
            }
    }
}