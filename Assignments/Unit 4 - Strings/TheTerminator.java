/****************************
 * THE TERMINATOR              *
 * AAYUSH SOOD                 *
 * NOVEMBER 12, 2025             *
 *                                *
 * PURPOSE: A PROGRAM THAT       *
 * GENERATES A RANDOM            *
 * SEQUENCE OF NUMBERS AND       *
 * ELIMINATES ALL INSTANCES      *
 * OF 0'S                        *
 **********************************/
//---------------------------
public class TheTerminator {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR RANDOMLY GENERATED NUMBER STRING, NON-ZERO NUMBER
        // STRING, THE FRONT AND BACK OF A SUBSTRING, AND A RANDOM NUMBER
        String strOriginalNumbers = "", strNonZeroNumbers = "", strFront = "", strBack = "";
        int intRandomNumber = 0;

        // GENERATE A SEQUENCE OF 20 RANDOM NUMBERS
        for (int i = 0; i < 20; i++) {
            // RANDOMLY GENERATE A NUMBER BETWEEN 0 AND 9
            intRandomNumber = (int)((9 - 0 + 1) * Math.random() + 0);

            if (strOriginalNumbers.length() > 0) {
                // ADD COMMAS BEFORE NUMBERS WITH THE EXCEPTION OF THE FIRST
                // NUMBER
                strOriginalNumbers = strOriginalNumbers + ", ";
            }

            // ADD RANDOMLY GENERATED NUMBER TO THE ORIGINAL NUMBER
            // SEQUENCE
            strOriginalNumbers = strOriginalNumbers + intRandomNumber;
        }

        // ASSIGN THE ORIGINAL SEQUENCE TO THE WORKING SEQUENCE
        strNonZeroNumbers = strOriginalNumbers;

        // LOOP THROUGH THE SEQUENCE TO TERMINATE 0'S
        for (int i = 0; i < strNonZeroNumbers.length(); i++) {
            // GET THE CURRENT CHARACTER IN THE SEQUENCE OF NUMBERS
            char charCurrentNumber = strNonZeroNumbers.charAt(i);

            // CHECK IF CURRENT CHARACTER IS A 0
            if (charCurrentNumber == '0') {
                // CONDITIONALS HANDLE EDGE CASES WHERE 0'S MAY BE
                // PRESENT AT START OR END OF SEQUENCE
                if (i == 0) {
                    strFront = "";
                    strBack = strNonZeroNumbers.substring(i + 2);
                } else if (i == strNonZeroNumbers.length() - 1) {
                    strFront = strNonZeroNumbers.substring(0, i - 2);
                    strBack = "";
                } else {
                    strFront = strNonZeroNumbers.substring(0, i - 1);
                    strBack = strNonZeroNumbers.substring(i + 2);
                }

                // ADD NEW STRING WITHOUT THE CURRENT INSTANCE OF 0
                // TO THE NEW SQEUQNCE
                strNonZeroNumbers = strFront + strBack;

                // RESET LOOP TO CHECK THE STRING AGAIN AND NOT
                // MISS ANY ZEROS
                i = -1;
            }
        }

        // OUTPUT ORIGINAL AND NEW SEQUENCE
        System.out.println("Your original numbers are:    " + strOriginalNumbers);
        System.out.println("Your numbers with zeros terminated are:    " + strNonZeroNumbers);
    }
}
