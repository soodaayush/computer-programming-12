/***********************************
 * ALPHABETICAL ORDER                *
 * AAYUSH SOOD                       *
 * OCTOBER 29, 2025                  *
 *                                    *
 * PURPOSE: TO DISPLAY EVERY         *
 * SECOND LETTER OF THE              *
 * ALPHABET STARTING WITH THE        *
 * LETTER A, AND ANOTHER             *
 * SEQUENCE STARTING WITH THE        *
 * LETTER B                          *
 *************************************/
//-------------------------------
public class AlphabeticalOrder {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR BOTH STRING SEQUENCES AND ASCII NUMBERS
        String strFirstAlphabetSequence = "", strSecondAlphabetSequence = "";
        int intFirstAlphabetSequenceASCIINumber = 65, intSecondAlphabetSequenceASCIINumber = 66;

        // GENERATE BOTH SEQUENCES
        for (int i = 0; i < 13; i++) {
            // ADD A NEW LETTER TO THE CURRENT SEQUENCE
            strFirstAlphabetSequence = strFirstAlphabetSequence + (char)intFirstAlphabetSequenceASCIINumber;
            strSecondAlphabetSequence = strSecondAlphabetSequence + (char)intSecondAlphabetSequenceASCIINumber;

            // INCREMENT ASCII NUMBERS BY 2 TO MOVE TWO LETTERS IN THE APLHABET
            intFirstAlphabetSequenceASCIINumber += 2;
            intSecondAlphabetSequenceASCIINumber += 2;
        }

        // OUTPUT BOTH ALPHABET SEQUENCES
        System.out.println(strFirstAlphabetSequence);
        System.out.println(strSecondAlphabetSequence);
    }
}
