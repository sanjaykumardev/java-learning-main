import java.util.*;

public class jman {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    int x = Integer.parseInt(n, 2);
    System.out.println(x);
    for(int i=0; i<9; i++){
      if(x % (2 * 2 ) * i == 0){
        System.out.println("true");
        break;
      }else{
        System.out.println("flase");
      }
    }
     
  }
}
