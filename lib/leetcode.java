import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String result = multiply(num1, num2);
        System.out.println("The product is: " + result);
    }

    public static String multiply(String num1, String num2) {
        
         
        String s = num1* num2; 
        System.out.println(s);
      
        
        }

      
    
}
