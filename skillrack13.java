import java.util.*;


public class skillrack13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int dec = sc.nextInt();
      String s = Integer.toBinaryString(dec);
      StringBuilder  res = new StringBuilder();
      // String a = s.toString();
      int i=0;
      int lenght = s.length();
      while(i < lenght){
        int count = 0;
        int j=i;
        if(s.charAt(i) == '0' ){
            while(j < lenght && s.charAt(j) == '0'){
              count++;
              j++;
            }
            while(i<j){
              res.append(count);
              i++;
            }
        }else{
          res.append('1');
          i++;
        }
      }
      String rem = res.toString();
      int x = Integer.parseInt(rem);
      System.out.println(Integer.toBinaryString(x));
    }
  }