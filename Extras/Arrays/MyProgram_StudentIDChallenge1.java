public class MyProgram {
    public static void main(String[] args) {
        int intStudentID[] = new int[40];

        for (int i = 0; i < 40; i++) {
            intStudentID[i] = (int)((9999 - 1000 + 1) * Math.random() + 1000);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ")  " + intStudentID[i] + "\t\t" + (i + 10) + ")  " + intStudentID[i + 10] + "\t\t" + (i + 20) + ")  " + intStudentID[i + 20] + "\t\t" + (i + 30) + ")  " + intStudentID[i + 30]);
        }
    }
}
