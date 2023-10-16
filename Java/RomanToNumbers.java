package Assignment;
import java.util.Scanner;

public class RomanToNumbers {
    
    public static int RomanToNumber(String roman) {
        int result = 0;
        
        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            int currentValue = romanToValue(currentChar);
            
            if (i + 1 < roman.length()) {
                char nextChar = roman.charAt(i + 1);
                int nextValue = romanToValue(nextChar);
                
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
    
    public static int romanToValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:");
        String roman = scan.next();
        scan.close();
        int number = RomanToNumber(roman);
        System.out.println("The equivalent number is: " + number);
    }
}
