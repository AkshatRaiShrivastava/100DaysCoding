
import java.util.*;

public class zeroSumTriplets {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1, high = nums.length - 1;
                while (low < high) {
                    int curr_sum = nums[i] + nums[low] + nums[high];
                    if (curr_sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // Move the low pointer to the next unique element
                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        // Move the high pointer to the previous unique element
                        while (low < high && nums[high] == nums[high - 1])
                            high--;

                        low++;
                        high--;
                    } else if (curr_sum < 0) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 0, -1, 2, -3, 1 };
        List<List<Integer>> triplets = threeSum(nums);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}