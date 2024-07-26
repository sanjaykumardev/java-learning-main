import java.util.Scanner;
import java.util.Arrays;

public class ups {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    if(agagram(str1 ,str2)){
      System.out.print("anagram");
    }else{
      System.out.print("  Not anagram");
    }


  }
  public static boolean agagram(String str1, String str2){

    str1  = str1.replaceAll(" \\s ", "").toLowerCase();
    str2 = str2.replaceAll(" \\s ", "").toLowerCase();

      char[] s = str1.toCharArray();
      char[] l = str2.toCharArray();

      Arrays.sort(s);
      Arrays.sort(l);

      return Arrays.equals(s , l);
  }
}