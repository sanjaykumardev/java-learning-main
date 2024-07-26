import java.util.Scanner;


public class ups5 {
  public static void main(String[] args) {
   

    int s = 7;
    char ch ='A';
    for(int i=1; i<s; i++){
      for(int j=i; j<s; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=(2 * i-1); j++){
        System.out.print(ch );
        if(j<i){
          ch++;
        } else{
          ch--;
        }
      }
      System.out.println();
      ch ='A';
    }
  }
}
