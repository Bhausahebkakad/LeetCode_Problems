class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int  i = 0; i <nums.length; i++)
        {
            nums[i] = nums[i]*nums[i];
        }
            Arrays.sort(nums);
                // int[] ans = Arrays.stream(nums)
                //   .map(val -> val * val)
                //   .sorted()
                //   .toArray();
                // return ans;

        return nums;
    }
}