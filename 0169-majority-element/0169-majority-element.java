class Solution {
    public int majorityElement(int[] nums) {
        
        int ans = 0; 
        int ele = 0;
        if(nums.length == 1)
        {
            ele = nums[0];
        }
        else 
        {   
            for(int i = 0; i < nums.length; i++)
            {
                int count = 0;

                for(int j = i + 1 ; j < nums.length; j++)
                {
                    if(nums[i] == nums[j])
                    {
                        count ++;
                    }
                }

                if(count > ans)
                {
                    ele = nums[i];
                    ans = count;
                }
            }
        }
        return ele;
    }
}