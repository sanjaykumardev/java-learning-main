import java.util.Scanner;

public class codeforce{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0; i<n; i++ ){
      arr[i]= sc.nextInt();
    }

    for(int l : arr){
      System.out.println(sum(l));
    }


  }
  private static int sum(int l){
    if(l % 4 == 0){
      return l / 4 ;
   }
   else {

     return l / 4 + 1 ;
   }
  } 

}