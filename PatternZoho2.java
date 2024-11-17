import java.util.Scanner;

public class PatternZoho2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern(n);
  }

  // public static void pattern(int n){
  //   // inverted prymid
  //   for(int i=1; i<=n; i++){
  //     for(int j=1; j<=i; j++){
  //       System.out.print(" ");
  //     }
      
  //     for(int k=i; k<=n; k++){
  //       System.out.print("* ");
  //     }

  //     System.out.println();
  //   }
  // }

  // public static void pattern(int n){
  //   // prymid
  //   for(int i=1; i<=n; i++){
  //     for(int j=i; j<=n; j++){
  //       System.out.print(" ");
  //     }
      
  //     for(int j=1; j<=i; j++){
  //       System.out.print("* ");
  //     }
  //     System.out.println();
  //   }
  // }
  public static void pattern(int n) {
  //   // rigth sided triangle
    
    for (int i = 1; i <= n; i++) {
      int num = i;
        for (int j = 0; j <= n-i; j++) {
          System.out.print(num + " ");
          num += (n - j);
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
  }
  // public static void pattern(int n) {
  //   // oppsites rigth sided triangle
  //   for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) { 
  //           System.out.print(" ");
  //       }
  //       for (int j = i; j <= n; j++) {
  //           System.out.print("*");
  //       }
  //       System.out.println();
  //   }
  // }

  // public static void pattern(int n) {
  //   // Hill pattern
  //   for (int i = 1; i <= n; i++) {
  //       for (int j = i; j <= n; j++) { 
  //           System.out.print("  ");
  //       }
  //       for (int j = 1; j < i; j++) {
  //           System.out.print("* ");
  //       }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("* ");
  //     }
  //       System.out.println();
  //   }
  // }
  // public static void pattern(int n) {
  //   // Hill pattern is tilted 
  //   for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) { 
  //           System.out.print("  ");
  //       }
  //       for (int j = i; j < n; j++) {
  //           System.out.print("* ");
  //       }
  //       for (int j = i; j <= n; j++) {
  //         System.out.print("* ");
  //     }
  //       System.out.println();
  //   }
  // }
  // public static void pattern(int n) {
  //   // diamond
  //   for (int i = 1; i < n; i++) {
  //       for (int j = i; j <= n; j++) { 
  //           System.out.print("  ");
  //       }
  //       for (int j = 1; j < i; j++) {
  //           System.out.print("* ");
  //       }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("* ");
  //     }
    
  //       System.out.println();
  //   }
  //   for (int i = 1; i <= n; i++) {
  //     for (int j = 1; j <= i; j++) { 
  //         System.out.print("  ");
  //     }
  //     for (int j = i; j < n; j++) {
  //         System.out.print("* ");
  //     }
  //     for (int j = i; j <= n; j++) {
  //       System.out.print("* ");
  //   }
  
  //     System.out.println();
  // }
    
  // }

  // public static void pattern(int n ){
  //   int k = 0;
  //   for(int i=1; i<2*n; i++){
  //     for(int j=n; j>k; j--)
  //       System.out.print(" ");
  //    for(int j=1; j< 2*k+1; j++)
  //      System.out.print(" *");
  //     if(i<n-1)
  //       k++;
  //     else
  //       k--;
  //     System.out.println();
  //   }
  // }
}
