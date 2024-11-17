import java.util.Scanner;
import java.util.ArrayList;

public class skillrack9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();  
        int count = 0;
        int n = 3; 
        while (count < pos) {
            if (hasTwo(n)) {
                count++;
                if (count == pos) {
                    System.out.println(n);
                    break;
                }
            }
            n++;
        };
    }

    public static boolean hasTwo(int number) {
        int count = 0;

        while (number > 0) {
            count += number & 1; 
            number >>= 1; 
        }

        return count == 2;
    }
}
