import java.util.*;
 

class sumclosest{
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
              arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
           int num =  sum(arr , target);
           System.out.println(num);
  }
 public static int sum(int[] arr  , int target){

    Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if(currentSum == target) {
                    return currentSum;
                }
                
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if(currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum;
 }
}