import java.util.Scanner;


public class skillrack12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
     int count = 0;
    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int oddcount = 0; 

        for(int k=i; k<=j; k++){
          if(arr[k] % 2 != 0){
            oddcount++;
          }
        }
        if(oddcount == x){
          count++;
        }
      }
    }
    System.out.print(count);
    

  }
}