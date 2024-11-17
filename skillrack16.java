import java.util.*;

public class skillrack16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
     int value = 1;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
       arr[i][j] = value++;
      }
    }
    
    char v = 'a';
    for(int i = 0; i < n; i++) {
     
      for(int j = 0; j < n; j++) {
        if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || arr[i][j] %2 == 0) {
            arr[i][j] = arr[i][j];
            
          } else {
            arr[i][j] = v;
          }
          v++;

          if(v > 'z'){
            v = 'a';
          }
      }
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(arr[i][j] >= 'a' && arr[i][j] <= 'z') {
          System.out.print((char) arr[i][j] + " ");
        }else{
          System.out.print( arr[i][j] + " ");
        }
      }
      System.out.println();
    }

  //     for(int i=0; i<n; i++){
  //       for(int j=0; j<n; j++){
  //         System.out.print(arr[i][j] + " ");
  //       }
  //       System.out.println();
  //     }
  }
}

