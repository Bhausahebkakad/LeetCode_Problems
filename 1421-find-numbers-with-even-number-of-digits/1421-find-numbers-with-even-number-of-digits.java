class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;

        // String arr[] = new String[nums.length];

        for(int i = 0 ; i < nums.length; i++)
        {
            String arr = String.valueOf(nums[i]);

             if(arr.length() % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    
}