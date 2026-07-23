public class StudentIDChallenge3 {
    public static void main(String args[]) {
        int intStudentID[] = new int[40];
        int intNum = 0;
        boolean blnDuplicate = false;

        for (int i = 0; i < 40; i++) {
            do {
                intNum = (int)((100 - 50 + 1) * Math.random() + 50);

                blnDuplicate = false;

                for (int j = 0; j < intStudentID.length; j++) {
                    if (intNum == intStudentID[j]) {
                        blnDuplicate = true;
                    }
                }
            } while (blnDuplicate);

            intStudentID[i] = intNum;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ")  " + intStudentID[i] + "\t\t" + (i + 10) + ")  " + intStudentID[i + 10] + "\t\t" + (i + 20) + ")  " + intStudentID[i + 20] + "\t\t" + (i + 30) + ")  " + intStudentID[i + 30]);
        }
    }
}
