import java.util.*;


public class skillrack5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    for(int i=0; i<=9; i++){
      String modfiy = s.replace("X" , String.valueOf(i));
      long number = Long.parseLong(modfiy); 
      if(number % 4 == 0){
          System.out.print(number + " ");
      }
    }
  }
}
