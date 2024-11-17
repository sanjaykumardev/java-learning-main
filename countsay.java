import java.util.*;
import java.util.Scanner;

public class countsay {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     Integer[] arr = new Integer[num];
    for(int i=0; i<num; i++){
      arr[i] = sc.nextInt();
    }
      int sum = arr.length;
      if(sum == 0){
        System.out.println(sum);
      }
      HashMap <Integer ,Integer> ans = new HashMap<>();
      ArrayList<Integer > list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 ) {
                list.remove(i);
                break;
            }
        }
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            uniqueElements.add(arr[i]);
        }
       System.out.println(list.size());
  }
}