import java.util.*;

public class codechef {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    int arr[] =  new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int s = arr.length;
    int maxreach = 0;
    for(int i=0; i<s; i++){
      if(i > maxreach ){
        System.out.println("false");
        break;
      }
      maxreach = Math.max(maxreach , i+ arr[i]);
      if(maxreach >= arr.length){
        System.out.println("true");
        break;
      }
    }
    
  }
}
