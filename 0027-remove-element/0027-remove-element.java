class Solution {

    public int removeElement(int[] nums, int val) {
        
        int rem = nums.length;

        for(int i = 0,j=0 ; i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
                rem--;
            }
        }
        int k = (nums.length - rem);

        return k;
    }
}