
import java.util.*;
import java.util.Scanner;

public class skillrack{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input S1 and S2
        String S1 = scanner.nextLine();
        String S2 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Print the result of the traversal game
        System.out.println(traverseStrings(S1, S2));
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String traverseStrings(String S1, String S2) {
        StringBuilder result = new StringBuilder();
        int n = S1.length();
        
        // Start from the last character of S1
        int i = n - 1;
        boolean fromS1 = true;
        
        while (i >= 0) {
            char currentChar = fromS1 ? S1.charAt(i) : S2.charAt(i);
            result.append(currentChar);
            
            // Move left to the next character
            i--;
            
            if (i >= 0) {
                char s1Char = S1.charAt(i);
                char s2Char = S2.charAt(i);
                
                // Check if both are vowels or consonants
                if ((isVowel(s1Char) && isVowel(s2Char)) || (!isVowel(s1Char) && !isVowel(s2Char))) {
                    fromS1 = !fromS1;  // Switch between S1 and S2
                }
            }
        }
        
        return result.toString();
    }
}
