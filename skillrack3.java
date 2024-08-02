import java.util.*;
import java.util.List;
import java.util.Collections;

public class skillrack3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    while(sc.hasNextInt()){
      int number  = sc.nextInt();
      list.add(number);
    }
    sc.close(); 
    Collections.sort(list);
    
    int[] arr = list.stream().mapToInt(i -> i).toArray();
    int sum =0;
    for(int i=0; i<arr.length; i+=2){
      sum = arr[i] + arr[i+1];
    }
    System.out.println();
  }
}
