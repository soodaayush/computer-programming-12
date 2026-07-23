/****************************
 * BOWLING SCORES              *
 * AAYUSH SOOD                 *
 * OCTOBER 22, 2025            *
 *                              *
 * PURPOSE: A PROGRAM THAT     *
 * ALLOWS THE USER TO INPUT    *
 * THEIR BOWLING SCORES AND    *
 * DISPLAYS THEIR HIGHEST      *
 * AND LOWEST SCORE, AS        *
 * WELL AS THEIR AVERAGE       *
 * SCORE                       *
 ******************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class Bowling {
    public static void main(String args[]) {
        // DEFINE VARIABLES TO TRACK BOWLING STATS AND SCANNER
        int intCurrentBowlingScore = 0;

        // TRACKS THE HIGHEST AND LOWEST BOWLING SCORES
        int intHighBowlingScore = 0, intLowBowlingScore = 0;

        // TRACKS THE SUM OF BOWLING SCORES AND THE NUMBER OF BOWLS TO
        // CALCULATE THE AVERAGE BOWLING SCORE
        int intNumberOfBowls = 0, intSumOfBowlingScores = 0;

        double dblAverageBowlingScore = 0;

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE THE USER TO THE PROGRAM
        System.out.println("Let's Go Bowling!\n");

        // INITIATE THE LOOP OF RECORDING BOWLING SCORES
        // RUNS AS LONG AS THE SCORE IS NOT EQUAL TO -1
        do {
            System.out.print("Enter bowling scorer (or -1 to quit): ");
            intCurrentBowlingScore = scrInput.nextInt();

            // CHECKS IF THE SCORE IS NOT BETWEEN 0 AND 300
            // IF IT IS NOT, IT REMINDS THE USER TO ENTER A VALID SCORE
            if ((intCurrentBowlingScore < 0 || intCurrentBowlingScore > 300) && (intCurrentBowlingScore != -1)) {
                System.out.println("Please enter a valid score between 0 and 300!");
            }

            // THE SCORES ARE RECORDED AS LONG AS THE CURRENT SCORE IS
            // NOT EQUAL TO -1
            if (intCurrentBowlingScore != -1) {
                // ON THE FIRST ITERATION OF THE LOOP, THE FIRST
                // BOWLING SCORE WILL BOTH BE THE LOWEST AND HIGHEST
                // RECORDED BOWLING SCORES
                if (intNumberOfBowls == 0) {
                    intLowBowlingScore = intCurrentBowlingScore;
                    intHighBowlingScore = intCurrentBowlingScore;
                }

                // IF THE BOWLING SCORE IS LESS THEN THE RECORDED LOWEST
                // BOWLING SCORE, UPDATE THE CURRENT TO BE THE LOWEST
                if (intCurrentBowlingScore < intLowBowlingScore) {
                    intLowBowlingScore = intCurrentBowlingScore;
                }

                // IF THE BOWLING SCORE IS GREATER THAN THE RECORDED HIGHEST
                // BOWLING SCORE, UPDATE THE CURRENT TO BE THE HIGHEST
                if (intCurrentBowlingScore > intHighBowlingScore) {
                    intHighBowlingScore = intCurrentBowlingScore;
                }

                // THE SCORES ARE ADDED TO THE SUM VARIABLE, AND
                // THE NUMBER OF RECORDED BOWLS IS INCREMENTED
                // BY 1
                intSumOfBowlingScores = intSumOfBowlingScores + intCurrentBowlingScore;
                intNumberOfBowls++;
            }
        } while (intCurrentBowlingScore != -1);

        // CALCULATE THE AVERAGE BOWLING SCORE
        dblAverageBowlingScore = (double)intSumOfBowlingScores / intNumberOfBowls;

        // PRINT THE BOWLERS'S STATS
        System.out.println("\nStats\n^^^^^^^\n");
        System.out.println("High Score:\t" + intHighBowlingScore);
        System.out.println("Low Score:\t" + intLowBowlingScore);
        System.out.println("Average Score:\t" + dblAverageBowlingScore);
    }
}
