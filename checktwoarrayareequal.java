import java.util.*;


class checktwoarrayareequal {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];
    for(int i=0; i<n; i++){
      arr1[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
      arr2[i] = sc.nextInt();
    }

    if(Arrays.equals(arr1, arr2)){
      System.out.println("is it same");
    }else{
      System.out.println("is not the same");
    }
   }  
}
