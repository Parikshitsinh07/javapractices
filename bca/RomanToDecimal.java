import java.util.*;

public class RomanToDecimal {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String romanNumeral;

        while (true) {
            System.out.println("1 - Roman to decimal converter\n0 - Exit:");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("Enter a Roman numeral:");
                romanNumeral = sc.nextLine();

                int decimalValue = romanToDecimal(romanNumeral);

                System.out.println("Roman numeral " + romanNumeral + " is equal to " + decimalValue);
            } else {
                System.exit(0);
            }
        }
    }
}
