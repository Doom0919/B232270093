package dome2;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
       public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int k = 0 ; k < nums.length-2;k++){
            int l = k + 1;
            int r = nums.length-1;
            while(l < r){
                int current_closet = nums[k]+nums[l]+nums[r];
                if(Math.abs(target-current_closet) < Math.abs(target-result)){
                    result = current_closet;
                }
                if(current_closet > target){
                    r--;
                }else if(current_closet<target){
                    l++;
                }else{
                    return current_closet;
                }
                
            }
        }
        return result;
    }
    public static void main( String[] args )
    {
        
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("test1 - Answer: " + threeSumClosest(nums1, target1));


        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("test1 - Answer: " + threeSumClosest(nums2, target2));


        int[] nums3 = {1, 1, 1, 1};
        int target3 = 3;
        System.out.println("test1 - Answer: " + threeSumClosest(nums3, target3));


        int[] nums4 = {-1, 0, 1, 1};
        int target4 = 2;
        System.out.println("test1 - Answer: " + threeSumClosest(nums4, target4));
    }

}
