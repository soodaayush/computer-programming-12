/*****************************
 * AREA                       *
 * AAYUSH SOOD                *
 * OCTOBER 6, 2025            *
 *                             *
 * PURPOSE: TO DETERMINE      *
 * THE AREA OF A ROOM GIVEN   *
 * ITS LENGTH AND WIDTH       *
 *******************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class Area {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES FOR ROOM LENGTH, WIDTH, AND AREA
        double dblRoomLength = 0, dblRoomWidth = 0, dblRoomArea = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // PROMPT USER FOR ROOM LENGTH AND WIDTH MEASUREMENTS
        System.out.print("Please enter the room's length: ");
        dblRoomLength = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Please enter the room's width: ");
        dblRoomWidth = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        // CALCULATE THE AREA OF THE ROOM GIVEN ITS MEASUREMENTS
        // A = L X W
        dblRoomArea = dblRoomLength * dblRoomWidth;

        // OUTPUT THE CALCULATED ROOM AREA
        System.out.println("\nRoom's area = " + dblRoomArea + " sq. m.");
    }
}
