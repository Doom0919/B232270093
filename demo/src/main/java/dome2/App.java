package dome2;

import java.util.Arrays;

/**
 * This class provides a method to find the sum of three integers
 * that is closest to a given target.
 */
public class App {

    /**
     * A constant representing the maximum integer value.
     */
  private static final int MAX_INT = Integer.MAX_VALUE;

    /**
     * Finds the sum of three integers in the given array that is
     * closest to the target value.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return the sum of the three integers closest to the target
     */
  public static int threeSumClosest(final int[] nums, final int target) {
    Arrays.sort(nums);
    int result = MAX_INT;

    for (int k = 0; k < nums.length - 2; k++) {
      int left = k + 1;
      int right = nums.length - 1;

      while (left < right) {
        final int currentClosest = nums[k] + nums[left] + nums[right];

        if (Math.abs(target - currentClosest) < Math.abs(target - result)) {
          result = currentClosest;
        }

        if (currentClosest > target) {
          right--;
        } else if (currentClosest < target) {
          left++;
        }
        else {
          return currentClosest;
        }
     }
    }
    return result;
  }

    /**
     * The main method to test the threeSumClosest function.
     *
     * @param args command-line arguments (not used)
     */
  public static void main(final String[] args) {
    final int[] nums1 = {-1, 2, 1, -4};
    final int target1 = 1;
    System.out.println("Test 1 - Answer: " + threeSumClosest(nums1, target1));

    final int[] nums2 = {0, 0, 0};
    final int target2 = 1;
    System.out.println("Test 2 - Answer: " + threeSumClosest(nums2, target2));

    final int[] nums3 = {1, 1, 1, 1};
    final int target3 = 3;
    System.out.println("Test 3 - Answer: " + threeSumClosest(nums3, target3));

    final int[] nums4 = {-1, 0, 1, 1};
    final int target4 = 2;
    System.out.println("Test 4 - Answer: " + threeSumClosest(nums4, target4));
  }
}
