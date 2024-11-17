import java.util.*;

public class practices5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char s = sc.next().charAt(0);
    if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
      System.out.println("vowle");
    }else{
      System.out.println("character");
    }
  }
}
