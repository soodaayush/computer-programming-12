/**********************************
 * TEXT ADVENTURE TEXT PRINTING     *
 * AAYUSH SODO                      *
 * NOVEMBER 13, 2025                 *
 *                                    *
 * PURPOSE: A PROGRAM THAT           *
 * PRINTS A STORY CHARACTER BY       *
 * CHARACTER                         *
 **************************************/
//---------------------------
public class TextAdventure {
    public static void main(String args[]) throws InterruptedException {
        // STRING TO HOLD THE OPENING SENTENCE TO OUR EPIC ADVENTURE
        String strStory = "You were part of a pack.";

        // PRINT THE STORY ONE CHARACTER AT A TIME, WITH A PAUSE BETWEEN EACH
        // CHARACTER
        int intLength = strStory.length(); // AMOUNT OF ITERATIONS IN A LOOP

        // FOR LOOP TO PRINT EACH CHARACTER IN THE STORY
        for (int c = 0; c < intLength; c++) {
            char charLetter = strStory.charAt(c); // Y

            // TELL THE PROGRAM TO GO TO SLEEP
            Thread.sleep(175); // 1000 milliseconds = 1 second

            // PRINT THE CHARACTER
            System.out.print(charLetter);
        }
    }
}
