public class StudentIDChallenge2{
    public static void main(String args[]){
        int intStudentID[] = new int[40];
        String strDuplicateNumbers = "";

        for (int i = 0; i < 40; i++) {
            intStudentID[i] = (int)((9999 - 1000 + 1) * Math.random() + 1000);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ")  " + intStudentID[i] + "\t\t" + (i + 10) + ")  " + intStudentID[i + 10] + "\t\t" + (i + 20) + ")  " + intStudentID[i + 20] + "\t\t" + (i + 30) + ")  " + intStudentID[i + 30]);
        }

        for (int i = 0; i < 40; i++) {
            for (int j = i + 1; j < 40; j++) {
                if (intStudentID[i] == intStudentID[j]) {
                    strDuplicateNumbers = strDuplicateNumbers + i + " and " + j + "\n";
                }
            }
        }

        if (strDuplicateNumbers.equals("")) {
            System.out.println("\nChecking for duplicates:\nno duplicates found!");
        } else {
            System.out.println("\nDuplicate IDs found in locations:\n" + strDuplicateNumbers);
        }
    }
}
