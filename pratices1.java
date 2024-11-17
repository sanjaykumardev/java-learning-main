import java.util.Scanner;
import java.util.ArrayList;

public class pratices1 {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
   }
    ArrayList<Integer> ans = new ArrayList<>();
   for(int i=0; i<arr.length; i++){
      if(arr[i] > arr[i+1]){
      ans.add(arr[i]);
    }
    if(arr[i] < arr[i+1]){
      ans.add(arr[i+1]);
    }
  }
  ArrayList<Integer> rum = new ArrayList<>();
  Integer[] an = ans.toArray(new Integer[0]);
  int l = 0;
  int r = an.length-1;
  while(l < r){
    if(an[l] > an[r]){
        rum.add(an[l])  ;
    }
    else{
      rum.add(an[r]);
    }
  }
  System.out.println(rum);
  }
}
