class Solution {

    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;

        long sec = Long.MIN_VALUE;
        
        long th = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == first || nums[i] == sec || nums[i] == th)
            {
                continue;
            }
            if(nums[i] > first)
            {
                th = sec;
                sec = first;
                first = nums[i];
            }
            else if(nums[i] > sec)
            {
                th = sec;
                sec = nums[i];
            }
            else if(nums[i] > th)
            {
                th = nums[i];
            }
        }

        return th == Long.MIN_VALUE ? (int) first: (int) th;
    
    }
}