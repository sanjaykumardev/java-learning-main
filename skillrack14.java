import java.util.*;

public class skillrack14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int shift = 0; shift < n; shift++) {
           
            int lastElement = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = lastElement;

           
            if (arr[n - 1] % 2 == 0) {
                
                System.out.println(  arr);
            }
        }
    }
}
