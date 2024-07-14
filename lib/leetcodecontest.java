import java.util.Scanner;

public class leetcodecontest {

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s = sc.nextLine();

    getsmall(s);
   }
  
    public static void getsmall(String s) {
        char[] c = s.toCharArray();
       
        for(int i=0; i<c.length-1; i++){
        
             if((c[i] % 2 == 0 && c[i+1] % 2 == 0 ) || (c[i] %2 != 0 && c[i+1] % 2 != 0)  ){
              if(c[i] > c[i+1]){
                char temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
                break;
              }
            }
        }
        System.out.println(c);
    }
}


// class Solution {
//   public String getSmallestString(String s) {
//       char[] c = s.toCharArray();

//       for (int i = 0; i < c.length - 1; i++) {
//           if ((c[i] % 2 == 0 && c[i + 1] % 2 == 0) || (c[i] % 2 != 0 && c[i + 1] % 2 != 0)) {
//               if (c[i] > c[i + 1]) {
//                   // Swap adjacent digits
//                   char temp = c[i];
//                   c[i] = c[i + 1];
//                   c[i + 1] = temp;
//                   break; // Swap at most once
//               }
//           }
//       }
//       return new String(c);
//   }
// }


