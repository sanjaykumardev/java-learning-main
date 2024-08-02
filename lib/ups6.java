import java.util.Scanner;

public class ups6{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] matrix = new int[N][M];
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        matrix[i][j] = sc.nextInt();
      }
    }

    Matrixrow(matrix);
    Matrixcol(matrix);
  }

   public static void Matrixrow(int[][] matrix){ 
       int sum =0;
       for(int i=0; i<matrix.length; i++){
        sum=0;
        for(int j =0; j<matrix.length; j++){
           sum = sum + matrix[i][j];
         } 
         System.out.println("row :"+ sum);
       }
       sum  = 0;


      }
      
      public static void Matrixcol(int[][] matrix){ 
        int sum =0;
        for(int i=0; i<matrix.length; i++){
          sum =0;
         for(int j =0; j<matrix.length; j++){
            sum = sum + matrix[j][i];
          } 
          System.out.println("col :" + sum);
        }
        sum  = 0;

       }
}