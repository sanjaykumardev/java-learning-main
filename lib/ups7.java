import java.util.Scanner;

public class ups7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();

    a = a + b ;
    b = a.substring(0, a.length() - b.length() );
    a = a.substring(b.length());
    System.out.println(a + b);
  }
}
