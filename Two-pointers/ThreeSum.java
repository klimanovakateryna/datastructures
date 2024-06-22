import java.util.Arrays;
import java.util.Random;

public class ThreeSum {
   public static boolean findSumOfThree(int[] nums, int target){
       sortArray(nums); // Sort the array
       int lo, hi;
       for(int i = 0; i < nums.length; i++){ // Iterate through the array
           lo = i + 1; // Start lo pointer from the next element
           hi = nums.length - 1; // Start hi pointer from the last element
       while(lo < hi){
           if(nums[i] + nums[lo] + nums[hi] == target){ // Calculate the sum of the three elements
               return true;  // If the sum matches the target, return true
           } else if (nums[i] + nums[lo] + nums[hi] < target){
               lo++; // If the sum is less than the target, move the lo pointer to the right
           } else {
               hi--; // If the sum is greater than the target, move the hi pointer to the left
           }
       }
   }
   return false;   // If no such triplet is found, return false
}

   private static void sortArray(int[] nums) {  // Method to sort the array using selection sort
      
       for(int i = 0; i < nums.length - 1; i++){  // Find the minimum element in the unsorted part of the array
           int min = nums[i];
           int indexOfMin = i;
           for(int j = i + 1; j < nums.length; j++){
               if(nums[j] < min) {
                   min = nums[j];
                   indexOfMin = j;
               }
           }
       swap(nums, i, indexOfMin); // Swap the found minimum element with the first element of the unsorted part
       }
   }

   private static void swap(int[] nums, int a, int b) {  // Helper method to swap two elements in an array
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;

   }

   public static void main(String[] args){
       int[] nums = new int[10];
       Random random = new Random();
       for(int i = 0; i < nums.length; i++){
           nums[i] = random.nextInt(10000);
       }

       System.out.println(Arrays.toString(nums));
       sortArray(nums);
       System.out.println(Arrays.toString(nums));

       boolean result = findSumOfThree(nums, 55);

       int[] nums1 = {1, -1, 0};
       boolean result2 = findSumOfThree(nums1, -1);
      
       System.out.println(result);
       System.out.println(result2);
