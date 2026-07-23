/****************************
 * EXAM REWRITE             *
 * AAYUSH SOOD              *
 * OCTOBER 27, 2025         *
 *                          *
 * PURPOSE: TO DETERMINE IF *
 * BILLYBOB CAN REWRITE AN  *
 * EXAM BASED ON PARAMETERS *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class ExamRewrite {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR EXAM GRADE, NUMBER OF ABSENCES,
        // NAME OF COURSE, AND SCANNER
            int intExamGrade = 0, intAbsences = 0;
            String strCourseName = "", strFlush = "";
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT BILLYBOB FOR THEIR EXAM GRADE, NUMBER OF ABSENCES,
        // AND THE NAME OF THEIR COURSE
            System.out.println("Welcome to your exam rewrite eligibilty portal!");
            
            System.out.print("\n\nEnter your exam grade: ");
            intExamGrade = scrInput.nextInt();
            strFlush = scrInput.nextLine();
            
            System.out.print("Enter your number of absences: ");
            intAbsences = scrInput.nextInt();
            strFlush = scrInput.nextLine();
            
            System.out.print("Enter the name of the course: ");
            strCourseName = scrInput.nextLine();
            
        // DETERMINE IF BILLYBOB CAN REWRITE THEIR EXAM
            if ((intExamGrade >= 40 && intExamGrade <= 49) || intAbsences == 0) {
                System.out.println("\nYou may rewrite your " + strCourseName + " exam.");
            } else {
                System.out.println("\nYou may not rewrite your " + strCourseName + " exam.");
            }
    }
}