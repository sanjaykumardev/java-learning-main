import java.util.*;
import java.util.Scanner;


public class nonrepeting {
  

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
  }

 
  boolean s = false;
  int count[] = new int[n];
    for (int i = 0; i < n; i++) {
       count[arr[i]]++;
    }

    for(int i=0; i<n; i++){
      if(count[i] == 1){
        System.out.print(i + " ");
      }
    }
 }
}