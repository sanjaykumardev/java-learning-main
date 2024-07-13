// import java.util.HashMap;
// import java.util.Scanner;
// import java.util.Arrays;

// public class maxinmumconntreach {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }
//     string(arr);
    
//   }

//   public static void string(int[] arr){
//     Arrays.sort(arr);
//      int s = arr.length;
//      int max_reach =0;
//     HashMap< Integer ,Integer > res = new HashMap<>();
//     int count =0;
//     for(int i=0; i<s-1; i++){
//       if(arr[i] == arr[i+1] ){
//         res.put(i , arr[i]);
//         count = arr[i];
//       }
//     }
//       for(int i=0; i<arr.length; i++){
//         if (!res.containsKey(i)) {
//           max_reach = Math.min(count , i);
//         }
//       }
    
//     System.out.println(max_reach);
//   }
// }


import java.util.Scanner;

public class maxinmumconntreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int maxValue = 0;
        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

       
        int[] frequencyArray = new int[maxValue + 1];

        
        for (int num : numbers) {
            frequencyArray[num]++;
        }

       
        int mostFre = Integer.MAX_VALUE;
        int highestFrequency = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            int frequency = frequencyArray[i];

            if (frequency > highestFrequency || (frequency == highestFrequency && i < mostFre)) {
                highestFrequency = frequency;
                mostFre = i;
            }
        }

        System.out.println(mostFre);
    }
}