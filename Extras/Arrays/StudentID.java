/****************************
 * STUDENT ID NUMBERS          *
 * AAYUSH SOOD                 *
 * DECEMBER 1, 2025             *
 *                               *
 * PURPOSE: A PROGRAM THAT      *
 * GENERATES A BUNCH OF         *
 * STUDENT ID NUMBERS WITH      *
 * LITTLE CODE NEEDED           *
 *********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class StudentID {
    public static void main(String args[]) {
        // CREATE AN ARRAY TO HOLD 40 STUDENT ID NUMBERS
        // THIS MEANS WE WILL HAVE A GROUP OF 40
        // VARIABLES ALL WITH THE SAME NAME, BUT UNIQUE INDEX #
        int intStudentID[] = new int[40]; // INDEX # 0 - 39

        // GIVE EACH STUDENT A FOUR DIGIT ID NUMBER
        for (int i = 0; i < 40; i++) {
            intStudentID[i] = (int)((9999 - 1000 + 1) * Math.random() + 1000);
        }

        // OUTPUT ALL STUDENT ID'S
        for (int i = 0; i < 40; i++) {
            System.out.println(i + 1 + ")\t" + intStudentID[i]);
        }
    }
}
