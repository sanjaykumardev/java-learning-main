import java.util.*;


public class sumofarray {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int s  = sc.nextInt();
    int[] arr = new int[s];
    for(int i=0; i<s; i++){
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0; i<arr.length; i++){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
