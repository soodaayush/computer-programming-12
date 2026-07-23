/**************************
 * CAR RECALL              *
 * AAYUSH SOOD              *
 * OCTOBER 7, 2025          *
 *                          *
 * PURPOSE: TO PROMPT      *
 * THE USER FOR THEIR      *
 * CAR MODEL AND           *
 * DETERMINE IF ITS        *
 * DEFECTIVE OR NOT        *
 ****************************/
//----------------------
import java.util.Scanner;
//----------------------
public class CarRecall {
    public static void main(String args[]) {
    // DEFINE VARIABLES FOR CAR MODEL NUMBER AND SCANNER
        int intCarModelNumber;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

    // PROMPT THE CAR OWNER FOR THEIR MODEL NUMBER
        System.out.print("Enter the car's model number: ");
        intCarModelNumber = scrInput.nextInt();
        strFlush = scrInput.nextLine();

    // CHECK IF THE CAR MODEL NUMBER HAS BEEN FOUND TO HAVE A DEFECT
        if (intCarModelNumber == 119 || intCarModelNumber == 179 || (intCarModelNumber <= 195 && intCarModelNumber >= 189) || intCarModelNumber == 221 || intCarModelNumber == 780) {
            System.out.println("Your car is defective. It must be repaired.");
        } else {
            System.out.println("Your car is not defective.");
        }
    }
}
