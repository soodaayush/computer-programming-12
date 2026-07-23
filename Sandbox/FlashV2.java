/****************************
 * FLASH                    *
 * AAYUSH SOOD              *
 * NOVEMBER 18, 2025        *
 *                          *
 * PURPOSE: TO MAKE TEXT    *
 * FLASH ALTERNATELY AS     *
 * UPPERCASE & LOWERCASE    *
 ***************************/
 //--------------------------
public class FlashV2 {
    public static void main(String[] args) throws InterruptedException {
        // MESSAGE, SWITCH, NAP TIME
            String strMessage = "!!** LOOK AT ME **!!";
            int intNapTime = 1000;
            boolean blnCaps = true;
            
        // LOOP TO CREATE ANIMATED TEXT
            do {
                if (blnCaps == true) { // FLIP THE BOOLEAN SWITCH
                    blnCaps = false;
                    
                    strMessage = strMessage.toLowerCase();
                } else {
                    blnCaps = true;
                    
                    strMessage = strMessage.toUpperCase();
                }
                
                // PRINT MESSAGE
                    System.out.println(strMessage);

                // TAKE A NAP
                    Thread.sleep(intNapTime);
                
                // CLEAR THE SCREEN
                    System.out.print("\033[H\033[2J");
                    
                // SPEED IT UP
                    intNapTime -= 50;
                
            } while(intNapTime > 0);
    }
}