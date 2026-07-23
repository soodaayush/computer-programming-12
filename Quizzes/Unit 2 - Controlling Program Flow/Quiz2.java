/*******************************************************
 * JAMES BARBER'S "THE URBAN PEASANT" MEAL RECOMMENDATIONS  *
 * AAYUSH SOOD                                              *
 * OCTOBER 28, 2025                                         *
 *                                                           *
 * PURPOSE: A PROGRAM THAT ALLOWS JAMES BARBER TO PROVIDE   *
 * YOU GOOD MEAL RECOMMENDATIONS FOR YOU BASED ON YOUR      *
 * DIETARY REQUIREMENTS.                                     *
 *************************************************************/
//------------------------------------------------------
import java.util.Scanner;
//------------------------------------------------------
public class Quiz2 {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR DIETARY REQUIREMENTS, RANDOM MEALS, AND
        // SCANNER
        String strEatsMeat = "", strEatsVeggies = "", strRecommendedMeal = "";
        int intRandomMealNumber = 0;

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE USER TO THE PROGRAM
        System.out.println("\t\t\t  James Barber's");
        System.out.println("\t\t\t The Urban Peasant");
        System.out.println("\t\t\tMeal Recommendations");

        // PROMPT USER FOR DIETARY REQUIREMENTS
        System.out.print("\n\nDo you eat meat?: ");
        strEatsMeat = scrInput.nextLine().toUpperCase();

        System.out.print("Do you eat fruit/veg?: ");
        strEatsVeggies = scrInput.nextLine().toUpperCase();

        // JAMES MAKES MEAL RECOMMENDATIONS BASED ON DIETARY REQUIREMENTS
        if (strEatsMeat.equals("YES") && strEatsVeggies.equals("NO")) {
            // GENERATE A RANDOM NUMBER FOR 1 OF 4 RANDOM MEALS IF THE USER
            // ANSWERS "YES" TO THE FIRST QUESTION AND "NO" TO THE SECOND
            // QUESTION
            intRandomMealNumber = (int)((4 - 1 + 1) * Math.random() + 1);

            // RECOMMEND A MEAL BASED ON THE RANDOMLY GENERATED NUMBER
            if (intRandomMealNumber == 1) {
                strRecommendedMeal = "a bacon smoothie!";
            } else if (intRandomMealNumber == 2) {
                strRecommendedMeal = "a cod tongue stew!";
            } else if (intRandomMealNumber == 3) {
                strRecommendedMeal = "drunken snow crab bouillabaisse!";
            } else if (intRandomMealNumber == 4) {
                strRecommendedMeal = "seal flipper pie!";
            }

            // OUTPUT RECOMMENDED MEAL
            System.out.println("\nJames' recommends " + strRecommendedMeal);
        } else if (strEatsMeat.equals("YES") && strEatsVeggies.equals("YES")) {
            // RECOMMEND WATERMELON CHICKEN IF USER ANSWERS "YES" TO BOTH
            // QUESTIONS
            strRecommendedMeal = "watermelon chicken!";

            System.out.println("\nJames' recommends " + strRecommendedMeal);
        } else if (strEatsMeat.equals("NO") && strEatsVeggies.equals("YES")) {
            // RECOMMEND A FALAFEL SALAD IF THE USER ANSWERS "NO" TO THE
            // FIRST QUESTION AND "YES" TO THE SECOND QUESTION
            strRecommendedMeal = "a falafel salad!";

            System.out.println("\nJames' recommends " + strRecommendedMeal);
        } else if (strEatsMeat.equals("NO") && strEatsVeggies.equals("NO")) {
            // RECOMMEND SOFT SERVE ICE CREAM ON WHITE BREAD IF USER
            // ANSWERS "NO" TO BOTH QUESTIONS
            strRecommendedMeal = "soft serve ice cream on white bread!";

            System.out.println("\nJames' recommends " + strRecommendedMeal);
        } else {
            // OUTPUT A STATEMENT INSTRUCTING THE USER TO PROVIDE A "YES" OR
            // "NO" ANSWER IF THEY HAVE NOT MET THAT REQUIREMENT
            System.out.println("\nPlease enter valid answers to the questions!");
        }
    }
}
