/*******************************************
 * GRADES                                   *
 * AAYUSH SOOD                              *
 * SEPTEMBER 26, 2025                       *
 *                                           *
 * PURPOSE: TO DISPLAY THE                  *
 * CORRESPONDING LETTER WITH                *
 * THE USER'S INPUTTED GRADE                *
 * PERCENTAGE                               *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class Grades {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR USER'S GRADE PERCENTAGE, CORRESPONDING GRADE LETTER, AND SCANNER
        int intGrade;
        String strLetter = "";

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // PROMPT USER FOR THEIR GRADE PERCENTAGE
        System.out.print("Enter the percentage: ");
        intGrade = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // DETERMINE GRADE LETTER BASED ON PROVIDED PERCENTAGE
        // 90 - 100: A
        // 80 - 89: B
        // 70 - 79: C
        // 60 - 69: D
        // BELOW 60: F
        if (intGrade <= 100 && intGrade >= 90) {
            strLetter = "A";
        } else if (intGrade <= 89 && intGrade >= 80) {
            strLetter = "B";
        } else if (intGrade <= 79 && intGrade >= 70) {
            strLetter = "C";
        } else if (intGrade <= 69 && intGrade >= 60) {
            strLetter = "D";
        } else if (intGrade < 60) {
            strLetter = "F";
        }

        // OUTPUT CORRESPONDING LETTER GRADE TO THE USER
        System.out.println("The corresponding letter grade is: " + strLetter);
    }
}
