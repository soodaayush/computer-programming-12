public class RandomNumbers {
    public static void main(String[] args) {
        String strNumbers = "", strUsedNumbers = "";
        int intRandomNumber = 0;
        
        do {
            intRandomNumber  = (int)((30 - 1 + 1) * Math.random()) + 1;
            int intIndex = strNumbers.indexOf(", " + intRandomNumber + ",");
            
            if (intIndex == -1) {
                if (strNumbers.length() == 0) {
                    strNumbers = strNumbers + ", " + intRandomNumber + ", ";
                } else {
                    strNumbers = strNumbers + intRandomNumber + ", ";
                }
                
                
                strUsedNumbers = strUsedNumbers + intRandomNumber;
            }
            
            
        } while (strUsedNumbers.length() < 51);
        
        strNumbers = strNumbers.substring(2, strNumbers.length() - 2);
        
        System.out.println(strNumbers);
       
    }
}