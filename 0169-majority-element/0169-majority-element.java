class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 0;
        int ele = nums[0];
        
        for(int i = 0; i < nums.length-1; i++)
{
            if(nums[i] != nums[i+1])
            {     
                
                if(maxCount < count)
                {
                    maxCount = count;
                    ele = nums[i];
                }

                count = 1;
            }
            else
            {
                count++;
            }

        }
         if(maxCount < count)
                {
                    maxCount = count;
                    ele = nums[nums.length-1];
                }

        return ele;

    }
}