import java.util.Scanner;
import java.util.Arrays;

public class skillrack2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    sc.close();
    number(arr);
  }
  
  public static void number(int[] arr){
    for(int i = 0; i < arr.length; i++){
      arr[i] = reversenum(arr[i]);
    }
    System.out.println(Arrays.toString(arr));
  }

  public static int reversenum(int number){
    int num = 0;
    while(number != 0){
      int digit = number % 10;
      num = num * 10 + digit;
      number /= 10;
    }
    return num;
  }
}
