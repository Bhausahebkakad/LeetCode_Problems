class Solution {
    public int searchInsert(int[] nums, int target) {
        
        short start = 0;
        int end = nums.length-1;

        while(start <= end)
        {   
            if(target <= nums[start])
            {
                return start;
            }
            else if(target > nums[end])
            {
                return end+1;
            }
            start++;
            end--;
        }
        if(start == end)
            {
                return start+1;
            }
        return start;
    }
}