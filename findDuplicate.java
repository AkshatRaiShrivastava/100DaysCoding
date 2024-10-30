import java.util.*;

public class findDuplicate {
    public static ArrayList<Integer> duplicates(int[] nums) {
        ArrayList<Integer> val = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    val.add(nums[i]);
                }
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] nums = { 90, 34, 22, 71, 34, 1, 5, 90, 22 };
        ArrayList<Integer> result = duplicates(nums);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
