/****************************************
 * DAD JOKE                             *
 * Aayush Sood                          *
 * September 8, 2025                    *
 *                                      *
 * PURPOSE: TO TELL A JOKE ONLY         *
 * DAD'S FIND FUNNY!                    *
****************************************/
//---------------------------------------
import java.util.Scanner;
//---------------------------------------
public class DadJoke {
    public static void main(String[] args) {
        
        //CREATE A SCANNER TO INSERT A PAUSE IN THE PROGRAM
          Scanner scrInput = new Scanner(System.in);
          String strPause = "";
          
        //TELL THE DAD JOKE
          System.out.print("What do you call a guy with a rubber toe? :       ");
          
        //PAUSE THE PROGRAM
          strPause = scrInput.nextLine();
          
        //SHOW ANSWER
          System.out.println("\n\nYou call him: ROBERTO!");
          
    }
}