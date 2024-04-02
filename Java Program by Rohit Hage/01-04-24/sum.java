import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two elements whose sum is equal to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements found with sum equal to " + target);
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
