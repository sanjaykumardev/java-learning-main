import java.util.*;

class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();
        
        // Remove duplicate characters
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < rev.length(); i++) {
            char currentChar = rev.charAt(i);
            boolean isDup = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == currentChar) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                unique.append(currentChar);
            }
        }
        
        // Convert the unique characters to a Character array for sorting
        Character[] str = new Character[unique.length()];
        for (int i = 0; i < unique.length(); i++) {
            str[i] = unique.charAt(i);
        }
        
        // Sort characters in descending order
        Arrays.sort(str, Collections.reverseOrder());

        // Convert the sorted character array back to a string
        StringBuilder finalstring = new StringBuilder(str.length);
        for (Character c : str) {
            finalstring.append(c);
        }

        System.out.println(finalstring.toString());
    }
}
