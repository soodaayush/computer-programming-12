/*******************************
 * MAGIC 8 BALL                 *
 * AAYUSH SOOD                  *
 * SEPTEMBER 24, 2025            *
 *                                *
 * PURPOSE: TO RECREATE THE     *
 * CLASSIC MAGIC 8 BALL FORTUNE *
 * TELLING GAME, WHERE A BALL   *
 * IS SHAKEN AND IT WILL GIVE   *
 * YOU ONE OF 20 DIFFERENT      *
 * ANSWERS TO A USER'S QUESTION *
 *********************************/
import java.util.Scanner;
//-----------------------------
public class Magic8Ball {
    public static void main(String args[]) {
        // DEFINE VARIABLES TO STORE USER'S QUESTION, MAGIC 8 BALL RESPONSE, THE RANDOMLY GENERATED NUMBER, AND SCANNER
        String strUserQuestion = "", strMagicBallResponse = "";
        int intRandomNumber;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THEIR QUESTION FOR THE MAGIC 8 BALL
        System.out.println("\t\"Magic 8 Ball\"");
        System.out.print("Ask the Magic 8 Ball your question: ");
        strUserQuestion = scrInput.nextLine();

        // RANDOMIZE MAGIC 8 BALL RESPONSE
        // EACH RESPONSE IS TIED TO A NUMBER BETWEEN 1 AND 20 THAT IS RANDOMLY GENERATED
        intRandomNumber = (int)((20 - 1 + 1) * Math.random() + 1);

        if (intRandomNumber == 1) {
            strMagicBallResponse = "As I see it, yes";
        } else if (intRandomNumber == 2) {
            strMagicBallResponse = "It is certain";
        } else if (intRandomNumber == 3) {
            strMagicBallResponse = "It is decidedly no";
        } else if (intRandomNumber == 4) {
            strMagicBallResponse = "Most likely";
        } else if (intRandomNumber == 5) {
            strMagicBallResponse = "Outlook good";
        } else if (intRandomNumber == 6) {
            strMagicBallResponse = "Signs point to yes";
        } else if (intRandomNumber == 7) {
            strMagicBallResponse = "Without a doubt";
        } else if (intRandomNumber == 8) {
            strMagicBallResponse = "Yes";
        } else if (intRandomNumber == 9) {
            strMagicBallResponse = "Yes - definitely";
        } else if (intRandomNumber == 10) {
            strMagicBallResponse = "You may rely on it";
        } else if (intRandomNumber == 11) {
            strMagicBallResponse = "Reply hazy, try again";
        } else if (intRandomNumber == 12) {
            strMagicBallResponse = "Ask again later";
        } else if (intRandomNumber == 13) {
            strMagicBallResponse = "Better not tell you now";
        } else if (intRandomNumber == 14) {
            strMagicBallResponse = "Cannot predict now";
        } else if (intRandomNumber == 15) {
            strMagicBallResponse = "Concentrate and ask again";
        } else if (intRandomNumber == 16) {
            strMagicBallResponse = "Don't count on it";
        } else if (intRandomNumber == 17) {
            strMagicBallResponse = "My reply is no";
        } else if (intRandomNumber == 18) {
            strMagicBallResponse = "My sources say no";
        } else if (intRandomNumber == 19) {
            strMagicBallResponse = "Outlook not so good";
        } else if (intRandomNumber == 20) {
            strMagicBallResponse = "Very doubt";
        }

        // OUTPUT MAGIC 8 BALL'S ANSWER TO THE USER
        System.out.println("The Magic 8 Ball says: " + strMagicBallResponse);
    }
}
