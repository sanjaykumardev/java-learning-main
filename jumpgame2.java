import java.util.*;

public class jumpgame2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt();
    int arr[] = new  int[N];
    for(int i=0; i<N; i++){

      arr[i] = sc.nextInt();
    }
    sc.close();


    //your logic /`]-
    int far =0;
    int  near=0; 
    int count= 0;
    
    while(far < arr.length-1){
      int maxreach =0;
      for(int i=0; i<=near; i++){
        maxreach = Math.max(maxreach , i + arr[i]);
      }
      near = far + 1 ;
      far = maxreach;
      count ++ ;
    
    }
    System.out.println(count);
  }
}
