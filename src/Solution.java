import java.util.HashMap;

class Solution {

    //num1 + num2 = target, target - num2 = num1
    public int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        HashMap<Integer, Integer> compliment = new HashMap<Integer, Integer>();
        for(int i = 0; i <= n; i++)
        {
            if(compliment.containsKey(target-nums[i]))
            {
                return new int[]{compliment.get(target-nums[i]), i};
            }
            compliment.put(nums[i], i);
        }

        return nums;
    }

    public boolean isValid(String s) {
        return false;
    }
}
