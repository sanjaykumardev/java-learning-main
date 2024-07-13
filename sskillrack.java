// import java.util.StringBuilder;
import java.util.*;

public class sskillrack {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String s = sc.nextLine();
    // StringBuilder res = StringBuilder();
    HashMap<Integer ,Character> count  = new HashMap<>(); 
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u'  || ch == 'e'){
         count.put(i , ch);
      }

    }
    char [] name = s.toCharArray();
    reversearray(name);
    
    
    StringBuilder result  =  new StringBuilder();
    for(int i = 0; i < name.length; i++){
     if (!count.containsKey(i)) {
        result.append(name[i]);
      }
    }
    System.out.println(result.toString());
  }


  private static void reversearray(char [] name){
    int left = 0;
    int right = name.length-1;
    while(left <right){
      char temp = name[left];
      name[left]= name[right];
      name[right]= temp;
      left++;
      right--;
    }
  }
}
