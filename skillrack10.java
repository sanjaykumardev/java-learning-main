import java.util.Scanner;

public class skillrack10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 6;
    
    for(int i=1; i<=n; i++){
      int num = i;
      for(int j = 0; j<=n-i; j++){
        System.out.print(num + " ");
        num += (n - j);
      }
      System.out.println();
    }
  }
}