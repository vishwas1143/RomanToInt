import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Initialize the result with the value of the last character in the Roman numeral
        int result = map.get(s.charAt(s.length() - 1));

        // Iterate through the Roman numeral string
        for (int i = s.length() - 2; i >= 0; i--) {
            // Comparing the current character to the next character
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                // If the current character is smaller, subtract its value
                result = result - map.get(s.charAt(i));
            } else {
                // If the current character is not smaller, add its value
                result = result + map.get(s.charAt(i));
            }
        }

        // Returnning the final result.
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        //  giving input 
        String romanNumeral = "IX";

        
        int num = solution.romanToInt(romanNumeral);

         
        System.out.println(num);
    }
}
