import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      
      int [][] mat  = new int[n][x];
      for(int i=0; i<n; i++){
          for(int j=0; j<x; j++){
              mat[i][j] = sc.nextInt();
          }
      }
      
      
      int numrows = mat.length;
     
      int count = 0;
      
      for(int row=0; row<numrows; row++){
          boolean isdescending = true;
          for(int col=0; col<mat[row].length-1; col++ ){
              if(mat[row][col] < mat[row][col+1] ){
                  isdescending = false;
                  break;
              }
          }
          
          if(isdescending){
              count++;
          }
      }
      System.out.print(count);
    }
}

