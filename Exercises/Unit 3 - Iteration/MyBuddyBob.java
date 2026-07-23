public class MyBuddyBob{
    public static void main(String[] args) throws InterruptedException {

        int i = 1;  //i is short for iteration --> loop or repetition  --> counter

        String strName = "Bob";

        do {

            System.out.println(i + "\t" + strName);

            // Tell the program to take a nap for .4 of a second
            Thread.sleep(400); // 1 second = 1000 milliseconds

            //count the counter up by 1
            i = i + 1;

        } while (i<=10);

        System.out.println("Sorry I missed that, what was that name?");
        System.out.print(strName);
    }
}

/*

Scope of a variable applies to the block of code it is declared in.

*/
