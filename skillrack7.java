import java.util.*;
import java.util.Scanner;

public class skillrack7{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String l = sc.next();
    // String p = sc.next();

    HashSet< Character> fin = new HashSet<>();
    HashSet< Character> fim = new HashSet<>();

    for(char cd : s.toCharArray()){
      
      fin.add(cd);
    }
    
    for(char cd : l.toCharArray()){
      fim.add(cd);
    }
    
    fin.retainAll(fim); 
    
    if (!fin.isEmpty()) {
      for (char c : fin) {
        System.out.print(c);
      }
    } else {
      System.out.println("-1");
    }
     
   }
}