//Given an array, colors, which contains a combination of the following three elements:
//0 (representing red)
//1 (representing white)
//2 (representing blue)
//Sort the array in place so that the elements of the same color are adjacent, with the colors in the order of red, white, and blue. To improve your problem-solving skills, do not utilize the built-in sort function.
 
       
        //otherwises, colors[curr] will be 2, so swap its value with colors[end] and decrement the end pointer
        //keep iterating until the current pointer exceeds the end pointer

import java.util.Arrays;

public class SortColors {
    public static int[] sortColors(int[] colors){
       int start = 0; //declare three pointers: start = 0; current = 0; end = length - 1;
       int current = 0;
       int end = colors.length - 1;
       while(current <= end){
        if(colors[current] == 0){ //if colors[curr] is 0, swap its value with colors[start] and increment both the curr and start pointers
            int temp = colors[current];
            colors[current] = colors[start];
            colors[start] = temp;
            current++;
            start++;
        } else if (colors[current] == 1){  //otherwise, if colors[current] is 1, just increment the curr pointer
            current++;
        } else {
            int temp = colors[current];
            colors[current] = colors[end];
            colors[end] = temp;
            end--;
        }
       }
        return colors;
    }
    public static void main(String[] args) {
        int[] colors1 = {0};
        int[] colors2 = {1,1,0,2};
        int[] colors3 = {2,1,1,0,0};

        int[] sorted1 = sortColors(colors1);
        int[] sorted2 = sortColors(colors2);
        int[] sorted3 = sortColors(colors3);

        System.out.println(Arrays.toString(sorted1));
        System.out.println(Arrays.toString(sorted2));
        System.out.println(Arrays.toString(sorted3));

    }
}
