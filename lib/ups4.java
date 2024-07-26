import java.util.Scanner;

public class ups4 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    String str = sc.nextLine();

    str = str.toLowerCase();
    char[] s = str.toCharArray();
    int sum =0;
    for(int i=0; i<s.length; i++){
      for(int j=i+1; j<s.length; j++){
        if(s[i] == s[j]){
         sum ++;
        }
      }
    }
    System.out.println(sum);
  }   
}  