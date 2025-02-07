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
<<<<<<< Tabnine <<<<<<<
    public static void main( String[] args )//-
    {//-
        ThreeSumClosest obj = new ThreeSumClosest();//-
    public static void main(String[] args) {//+
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Тест 1 - Хариу: " + obj.threeSumClosest(nums1, target1));//-
        System.out.println("Test 1 - Result: " + threeSumClosest(nums1, target1));//+

//-
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Тест 2 - Хариу: " + obj.threeSumClosest(nums2, target2));//-
        System.out.println("Test 2 - Result: " + threeSumClosest(nums2, target2));//+

//-
        int[] nums3 = {1, 1, 1, 1};
        int target3 = 3;
        System.out.println("Тест 3 - Хариу: " + obj.threeSumClosest(nums3, target3));//-
        System.out.println("Test 3 - Result: " + threeSumClosest(nums3, target3));//+

//-
        int[] nums4 = {-1, 0, 1, 1};
        int target4 = 2;
        System.out.println("Тест 4 - Хариу: " + obj.threeSumClosest(nums4, target4));//-
        System.out.println("Test 4 - Result: " + threeSumClosest(nums4, target4));//+
    }
>>>>>>> Tabnine >>>>>>>// {"conversationId":"47f0aa2a-f332-4d94-a3a0-9f17b9dee6e0","source":"instruct"}
}
