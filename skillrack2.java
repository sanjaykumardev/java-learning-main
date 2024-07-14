import java.util.*;

public class  skillrack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read integers into the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Convert array elements to a concatenated string
        HashMap<Integer , Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        String s = sb.toString();
        // Convert the concatenated string to a character array
        char[] chars = s.toCharArray();

        // Calculate the sum of adjacent character codes
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            sum = chars[i] + chars[i + 1]; 
            map.put(i , chars[i]);
        }

        // Check if the sum is odd or even
        if (sum % 2 != 0) {
            System.out.println(sum);
        }

        // Close the scanner
        sc.close();
    }
}