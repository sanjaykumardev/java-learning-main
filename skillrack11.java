import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class skillrack11 {
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
        
    
    int n = sc.nextInt();
    sc.nextLine();  
    
    List<String> res = new ArrayList<>();
   
    for (int i = 0; i < n; i++) {
       String l = sc.nextLine();
        String[] part = l.split(" ");
        String num = part[1];
        res.add(num);
    }
    
    
    int x = sc.nextInt();

    // sc.close();
    String p1 = "children";
    String p2 = "women";
    String p3 = "men";
   

    // for(String ch : lines){
    //   String[] str = ch.);
    //   System.out.println(str[0]);
    // }
    int child= 0;
    int wom = 0;
    int men  = 0;

    for(int i=0; i<x; i++){
      if(res.contains(p1)){
        res.remove(p1);
        child++;
      }
     else if(res.contains(p2) ){
        res.remove(p2);
        wom++;
      }
      else if(res.contains(p3)){
        res.remove(p3);
        men++;
      }
    }

    System.out.println(child + " " + wom + " " + men);
  }
}  
