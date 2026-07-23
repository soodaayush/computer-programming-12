//------------------------------
import java.util.Scanner;
//------------------------------
public class Stats {
    public static void main(String args[]) {
        // CREATE SCANNER AND ARRAY TO HOLD 5 STUDENT GRADES
        Scanner scrInput = new Scanner(System.in);

        int intGrades[] = new int[5];

        double dblMean = 0; // in stats, a mean is an average

        // GET 5 GRADES
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a grade: ");
            intGrades[i] = scrInput.nextInt();
        }

        // call on a method to calculate the mean mark
        dblMean = mean(intGrades);

        // output the average mark
        System.out.println("\n\nThe class average = " + dblMean);

        Akuti.signature("Stinky", 2025);
    }

    //*****************************
    //MEAN                         *
    //PRE: INT ARRAY OF VALUES     *
    //POST: RETURN THE MEAN OF     *
    // THE VALUES RECEIVED         *
    //*****************************
    public static double mean(int intMarks[]) {
        double dblAverage = 0;

        for (int i = 0; i < 5; i++) {
            dblAverage = dblAverage + intMarks[i];
        }

        dblAverage = dblAverage / 5;

        return dblAverage;
    }
}
