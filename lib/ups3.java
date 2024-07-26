import java.util.Scanner;

public class ups3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String trimmed = str.replaceAll("\\s", "");
    System.out.println(trimmed);
  } 
}
