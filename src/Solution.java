import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> traveled = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            Integer firstNum = target - current;

            Integer firstIndex = traveled.get(firstNum);

            if(firstIndex != null) return new int[]{firstIndex, i};

            traveled.put(nums[i],i);
        }
        return new int[]{};
    }
}
