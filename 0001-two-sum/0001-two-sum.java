    import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if(map.containsKey(val)) {
                output[0] = map.get(val);
                output[1] = i;
            }
            map.put(nums[i], i);
        }
        return output;
    }
}