package DAY2;

import java.util.*;




 class nonrepteing {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> ans  = new HashMap<>();
    for(int i=0; i<n; i++){
      int sum = ans.getOrDefault(i, 0);
           ans.put(i, sum+1);
           System.out.print(sum);
    }

  }
}
