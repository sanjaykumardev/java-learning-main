import java.util.*;



class seconlargestnumber {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

      int smallest = Integer.MAX_VALUE;
      int secondsmall = Integer.MAX_VALUE;

      for(int i=0; i<n; i++){
        if(arr[i] < smallest){
          secondsmall = smallest;
          smallest = arr[i];
        }else if(arr[i] < secondsmall || arr[i] !=  smallest) {
          secondsmall = arr[i];
        }
      }

      if(secondsmall == Integer.MAX_VALUE){
        System.out.println("it not the value");
      }else{
        System.out.println(secondsmall);
      }
  }
}
