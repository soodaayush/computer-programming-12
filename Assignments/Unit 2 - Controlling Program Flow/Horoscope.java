/*******************************
 * HOROSCOPE                     *
 * AAYUSH SOOD                   *
 * SEPTEMBER 26, 2025            *
 *                                *
 * PURPOSE: TO TAKE A            *
 * USER'S BIRTHDAY AND           *
 * DETERMINE THEIR               *
 * HOROSCOPE                     *
 ***********************************/
//----------------------------
import java.util.Scanner;
//----------------------------
public class Horoscope {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR USER'S BIRTHDAY AND THEIR CORRESPONDING HOROSCOPE
        int intBirthday;
        String strHoroscope;

        Scanner scrInput = new Scanner(System.in);

        String strFlush = "";

        // PROMPT USER FOR THEIR BIRTHDAY, WHICH WILL BE ENTERED AS A NUMBER
        // FOR EXAMPLE, A BIRTHDAY OF FEBRUARY 5 WILL BE ENTERED AS 205
        System.out.println("\t\tYour \"Lucky\" Stars");
        System.out.print("\nEnter your birthday: ");

        intBirthday = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // DETERMINE THE USER'S HOROSCOPE BASED ON THEIR BIRTHDAY AND OUTPUT IT ALONG WITH A CUSTOM MESSAGE FOR THE USER
        // ARIES: MARCH 21 - APRIL 19
        // TAURUS: APRIL 20 - MAY 20
        // GEMINI: MAY 21 - JUNE 21
        // CANCER: JUNE 22 - JULY 22
        // LEO: JULY 23 - AUGUST 22
        // VIRGO: AUGUST 23 - SEPTEMBER 22
        // LIBRA: SEPTEMBER 23 - OCTOBER 22
        // SCORPIO: OCTOBER 23 - NOVEMBER 21
        // SAGITTARIUS: NOVEMBER 22 - DECEMBER 21
        // CAPRICORN: DECEMBER 22 - JANUARY 19
        // AQUARIUS: JANUARY 20 - FEBRUARY 18
        // PISCES: FEBRUARY 19 - MARCH 20
        if ((intBirthday >= 321 && intBirthday <= 331) || (intBirthday >= 400 && intBirthday <= 419)) {
            System.out.println("\nAries - You are a fire child!");
            System.out.println("The spark follows you wherever you go!");
            System.out.println("Looks like you should carry some shades - things might get bright!");
        } else if ((intBirthday >= 420 && intBirthday <= 430) || (intBirthday >= 500 && intBirthday <= 520)) {
            System.out.println("\nTaurus - You are an Earth child!");
            System.out.println("Grounded energy surrounds you!");
            System.out.println("Looks like you should wear comfy shoes - you may be on solid paths today!");
        } else if ((intBirthday >= 521 && intBirthday <= 531) || (intBirthday >= 600 && intBirthday <= 621)) {
            System.out.println("\nGemini - You are a water child!");
            System.out.println("You will not need to go looking for water, it will find you!");
            System.out.println("Looks like you should pack your umbrella before heading out today!");
        } else if ((intBirthday >= 622 && intBirthday <= 630) || (intBirthday >= 700 && intBirthday <= 722)) {
            System.out.println("\nCancer - You are moon child!");
            System.out.println("Your tides shift with gentle rhythm!");
            System.out.println("Looks like you should keep a cozy blanket - nearby you'll need comfort");
        } else if ((intBirthday >= 723 && intBirthday <= 731) || (intBirthday >= 800 && intBirthday <= 822)) {
            System.out.println("\nLeo - You are a sun child!");
            System.out.println("Your warmth lights up the day!");
            System.out.println("Looks like you should bring your brightest smile - it will shine for all to see!");
        } else if ((intBirthday >= 823 && intBirthday <= 831) || (intBirthday >= 900 && intBirthday <= 922)) {
            System.out.println("\nVirgo - You are a nature child!");
            System.out.println("The world blooms around your careful touch!");
            System.out.println("Looks like you should stop and smell the flowers - details bring joy today!");
        } else if ((intBirthday >= 923 && intBirthday <= 930) || (intBirthday >= 1000 && intBirthday <= 1022)) {
            System.out.println("\nLibra - You are an air child!");
            System.out.println("Balance flows with every breeze!");
            System.out.println("Looks like you should keep a hairbrush ready - the wind may play with you!");
        } else if ((intBirthday >= 1023 && intBirthday <= 1031) || (intBirthday >= 1100 && intBirthday <= 1121)) {
            System.out.println("\nScorpio - You are a mystery child!");
            System.out.println("Depth follows you into every corner!");
            System.out.println("Looks like you should carry a notebook - secrets may reveal themselves!");
        } else if ((intBirthday >= 1122 && intBirthday <= 1130) || (intBirthday >= 1200 && intBirthday <= 1221)) {
            System.out.println("\nSagittarius - You are a fire child!");
            System.out.println("Adventure burns in your soul!");
            System.out.println("Looks like you should lace up your sneakers - you never know where the day will lead!");
        } else if ((intBirthday >= 1222 && intBirthday <= 1231) || (intBirthday >= 100 && intBirthday <= 119)) {
            System.out.println("\nCapricorn - You are a mountain child!");
            System.out.println("Strength rises beneath your steps!");
            System.out.println("Looks like you should carry a water bottle - you'll climb higher than expected today!");
        } else if ((intBirthday >= 120 && intBirthday <= 131) || (intBirthday >= 200 && intBirthday <= 218)) {
            System.out.println("\nAquarius - You are a storm child!");
            System.out.println("Ideas crackle like lightning around you!");
            System.out.println("Looks like you should keep your headphones - the thunder of thoughts will need music!");
        } else if ((intBirthday >= 219 && intBirthday <= 228) || (intBirthday >= 300 && intBirthday <= 320)) {
            System.out.println("Pisces - You are a dream child!");
            System.out.println("The ocean carries your spirit far!");
            System.out.println("Looks like you should bring your journal - today's waves may bring upstream!");
        } else {
            System.out.println("The date you entered does not correspond with any of the horoscopes!!!");
        }
    }
}
