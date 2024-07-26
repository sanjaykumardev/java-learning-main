import java.util.Scanner;

public class Skillrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int P = sc.nextInt();
        int Q = sc.nextInt();

        int sum = P / Q;
        int num = P * Q;
        int num1 = P + Q;
        int num2 = P - Q;

        for (int i = 0; i < n; i++) {
            if (arr[i] == sum) {
                System.out.print("/");
            } else if (arr[i] == num) {
                System.out.print("*");
            } else if (arr[i] == num1) {
                System.out.print("+");
            } else if (arr[i] == num2) {
                System.out.print("-");
            } else {
                System.out.print("#");
            }
        }
    }
}
