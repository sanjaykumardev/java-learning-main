import java.util.*;

public class presidio{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          
          
         int result = solve(s);
         System.out.println(result);
     }
     public static int solve(String s){
      int count = 0;
        
      if(s.length() == 1 || s.length() < 0) return -1;
      for (int i = 0; i < s.length() - 1; i++) {
            
          if (s.charAt(i) == ':' && s.charAt(i + 1) == ')') {
              count++;
          }
      }
      
      return count;
     }
}