class Solution {
    public int countPartitions(int[] nums) {
        
        int sum = 0;

        for(int i = 1; i < nums.length; i++)
        {
            sum += nums[i];
        }
        int count = 0;

        int leftSum = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            if((leftSum - sum)%2 == 0)
            {
                count++;
            }
            leftSum += nums[i];
            sum -= nums[i];
        }
        return count;
    }
}