import java.util.*;

public class digitsum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int sum = 0;
    String str = Integer.toString(number);
    for(int i=0; i<str.length(); i++){
      int digit = Character.getNumericValue(str.charAt(i));
      sum += digit;
    }
    // int sums = sum;
    int nums =0;
    String str2 = Integer.toString(sum);
    for(int i=0; i<str2.length(); i++){
      int digits = Character.getNumericValue(str2.charAt(i));
      nums += digits;
    }
    System.out.println(nums);
  }
}