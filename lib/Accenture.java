import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Accenture {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rat = sc.nextInt();
    int unit = sc.nextInt();
    int house = sc.nextInt();
    int[] arr = new int[house];
    for(int i=0; i<house; i++){
      arr[i] = sc.nextInt();
    }
    
      int sum = rat * unit;
      int n=0;
      for(int i=0; i<arr.length; i++){
          int num = arr[i];
          n++;
          if( num <= sum ){
            num = num + arr[i]; 
          }
          if(num >= sum){
            break;
          }
        }
        System.out.println(n);  
     }
   } SourceDataLine

