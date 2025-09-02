class Solution {
    public int missingNumber(int[] nums) {
        
        int arrSum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            arrSum = arrSum + nums[i];
        }
        
        // int l = nums.length;

        int ele = nums.length*(nums.length + 1) /2;

        return ele - arrSum;
    }
}