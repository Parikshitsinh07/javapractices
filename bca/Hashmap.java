
import java.util.*;

public class Main {
    public static int romanToDecimal(String roman) {
        HashMap<Character, Integer> romanToDecimalMap = new HashMap<>();
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int decimal = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanToDecimalMap.get(roman.charAt(i));

            if (currentValue < prevValue) {
                decimal -= currentValue;
            } else {
                decimal += currentValue;
            }

            prevValue = currentValue;
        }

        return decimal;
    }

    public static void main(String[] args) throws Exception {
        
       
         Scanner sc=new Scanner(System.in);
         int choice;
       
        while(true){
           
           System.out.print("\n 1 - roman to decimal converter \n 0 - exit \n >  ");
           
           choice=Integer.parseInt(sc.nextLine());
           
           if(choice==1){
               
               System.out.print("\nenter a roman number: ");
          
               String romanNumeral=sc.nextLine();
                   
        int decimalValue = romanToDecimal(romanNumeral);
        
        
        System.out.println("\nRoman numeral " + romanNumeral + " is equal to " + decimalValue+"\n");
    }
    
    else
          System.exit(0);
    
    }
}

}