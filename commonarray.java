import java.util.*;
import java .util.HashSet;
class commonarray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
        int l = sc.nextInt();
        int[] x = new int[l];
        int[] y = new int[l];
        int[] z = new int[l];

        for (int i = 0; i < l; i++) {
            if (sc.hasNextInt()) {
                x[i] = sc.nextInt();
              }
        }
        for (int i = 0; i < l; i++) {
            if (sc.hasNextInt()) {
                y[i] = sc.nextInt();
         
            }
        }
        for (int i = 0; i < l; i++) {
            if (sc.hasNextInt()) {
                z[i] = sc.nextInt();
            }
          }   

   arrys(x , y ,  z);
    
  }

  public static void arrys(int[] x , int[] y , int[] z){
        Set<Integer> commonXY = new HashSet<>();
        Set<Integer> commonXYZ = new HashSet<>();
    
    for(int i : x){
      for(int j : y){
        if(i == j){
          commonXY.add(i);
          break;
        }
      }
    }

      for(int i : commonXY){
       for(int k : z){
        if(i == k ){
          commonXYZ.add(i);
          break;
        }
       }
      }
    
        if (commonXYZ.isEmpty()) {
          System.out.print(0);
      }else{
        for (int val : commonXYZ) {
          System.out.print(val + " ");
      }
    }
  }
}