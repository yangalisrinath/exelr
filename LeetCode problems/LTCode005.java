import java.util.HashMap;
import java.util.Map;

public class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int x = nums[i];
            int y = target - x;
            if (d.containsKey(y)) {
                return new int[] {d.get(y), i};
            }
            d.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); 
    }
}