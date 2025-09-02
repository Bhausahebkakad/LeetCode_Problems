class Solution {
    public boolean containsDuplicate(int[] nums) {


        Arrays.sort(nums);

        for(int i = 0,j = i+1; i < nums.length-1; i++, j++)
        {
            if(nums[i] == nums[j])
            {
                return true;
            }
        }
        return false;
    }
}