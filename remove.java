import java.util.*;

class remove {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int s = 0;
    for(int i=1; i<n; i++){
      if( arr[i] != arr[s]){
       s++; 
       arr[s] = arr[i];
      }
    }
    System.out.println(s);
   }
}
