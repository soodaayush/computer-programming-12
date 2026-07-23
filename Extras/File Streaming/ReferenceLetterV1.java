/*************************
 * REFERENCE LETTER          *
 * AAYUSH SOOD                *
 * JANUARY 8, 2026              *
 *                                *
 * PURPOSE: TO CREATE            *
 * AN APPLICATION THAT           *
 * READS A REFERENCE              *
 * LETTER FROM A TEXT             *
 * FILE                            *
 ***********************************/
//----------------------
import java.util.Scanner;
import java.io.*;
//----------------------
public class ReferenceLetterV1 {
    public static void main(String[] args) {
        // VARIABLES NEEDED TO READ A FILE
        // LINE-BY-LINE
        File filReferenceLetter = new File("reference.txt");
        FileReader frdStream; // DECLARES AN INPUT STEAM FOR THE FILE SO WE CAN READ CHAR BY CHAR

        BufferedReader bufReadStream;

        String strOneLineOfText = "";

        // ATTEMPT TO INITIALIZE THE FILE READER AND THE BUFFEREDREADER
        try {
            frdStream = new FileReader(filReferenceLetter); // SEND THE FILE TO THE STREAM
            bufReadStream = new BufferedReader(frdStream); // CONNECT THE STREAM TO THE BUFFER

            // READ THE FILE
            do {
                // READ ONE LINE
                strOneLineOfText = bufReadStream.readLine(); // READ ONE LINE

                // PRINT ONE LINE
                if (strOneLineOfText != null) { // NULL MEANS WE HIT END OF FILE
                    System.out.println(strOneLineOfText);
                }
            } while (strOneLineOfText != null);

            bufReadStream.close();
            frdStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oopsie! File not found!");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading the file");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
