import java.util.*;

class qbss {
  public static void main(String[] args) {
    int n = 5;
    // //inverted right side triangle
    // for(int i=n; i>=1; i--){
    //   for(int j=i; j<=n; j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1; j<=i; j++){
    //     System.out.print("* ");
    //   }

    //   System.out.println();
    // }
    // // right sided tringle
    // for(int i=1; i<=n; i++){
    //   for(int j=i; j<=n; j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1; j<=i; j++){
    //     System.out.print("* ");
    //   }

    //   System.out.println();
    // }

    // hill pattern
    for(int i=n; i>= 1; i--){
      for(int j=i; j<=n; j++){
        System.out.print("  ");
      }
      for(int j=1; j<=i; j++){
        System.out.print("* ");
      }
      for(int j=1; j<i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

