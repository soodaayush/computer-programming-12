/****************************
 * COLOUR MIXER             *
 * AAYUSH SOOD              *
 * OCTOBER 27, 2025         *
 *                          *
 * PURPOSE: A PROGRAM WHERE *
 * THE USER CAN ENTER TWO   *
 * PRIMARY COLOURS AND      *
 * OUTPUTS THE RESULTANT    *
 * COLOR FROM MIXING        *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class ColourMixer {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR BOTH PRIMARY COLOURS, RESULTANT COLOUR,
        // AND SCANNER
            String strFirstPrimaryColour = "", strSecondPrimaryColour = "";
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT THE USER FOR THE TWO PRIMARY COLOURS TO BE MIXED
            System.out.print("Enter a primary colour: ");
            strFirstPrimaryColour = scrInput.nextLine().toUpperCase();
            
            System.out.print("Enter another primary colour: ");
            strSecondPrimaryColour = scrInput.nextLine().toUpperCase();
            
        // COMBINE THE COLOURS BASED ON COLOUR MIXING RULES
        // AND OUTPUT RESULTS
            if (strFirstPrimaryColour.equals("RED") && strSecondPrimaryColour.equals("YELLOW")) {
                System.out.println("red + yellow = orange!");
            } else if (strFirstPrimaryColour.equals("BLUE") && strSecondPrimaryColour.equals("YELLOW")) {
                System.out.println("blue + yellow = green!");
            } else if (strFirstPrimaryColour.equals("RED") && strSecondPrimaryColour.equals("BLUE")) {
                System.out.println("red + blue = purple!");
            } else if (strFirstPrimaryColour.equals(strSecondPrimaryColour)) {
                System.out.println("Please enter different colours");
            }
    }
}