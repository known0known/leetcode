import java.util.*;


public class Solution {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 1) return s.length();

        List<String> data = new ArrayList<>(s.length());

        String[] split = s.split("");

        int max = 0;

        for (int i = 0; i < split.length; i++) {
            String cur = split[i];
            if (data.contains(cur)) {
                int x = data.indexOf(cur);
                data = data.subList(x+ 1, data.size());
            }
            data.add(cur);
            if (max < data.size()) {
                max = data.size();
            }
        }
        return max;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        ListNode result = new ListNode();
        ListNode tmp = null;

        int carry = 0;

        while (tmp1 != null || tmp2 != null || carry != 0) {
            int val1 = tmp1 != null ? tmp1.val : 0;
            int val2 = tmp2 != null ? tmp2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;

            tmp1 = tmp1 != null ? tmp1.next : null;
            tmp2 = tmp2 != null ? tmp2.next: null;

            if(tmp == null) {
                tmp = result;
            } else {
                tmp.next = new ListNode();
                tmp = tmp.next;
            }

            tmp.val = sum - 10*carry;

        }
        return result;
    }
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
