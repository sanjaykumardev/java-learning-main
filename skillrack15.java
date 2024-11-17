import java.util.*;

public class skillrack15{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int tot = n * 1024 / r;

     int cost = 0;
     if(tot > 0){
      int frt = Math.min(tot, 500);
      cost += 1* frt;
      tot -= frt;
     }

     if(tot > 0){
      int frt2 = Math.min(tot, 500);
      cost += frt2 * 2;
      tot -= frt2;
     }

     if(tot > 0){
      cost += tot * 3;
     }

     System.out.println(cost);
    

     
  }
}