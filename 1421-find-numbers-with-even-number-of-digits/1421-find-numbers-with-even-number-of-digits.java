class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;

        String arr[] = new String[nums.length];

        for(int i = 0 ; i < nums.length; i++)
        {
            arr[i] = String.valueOf(nums[i]);

             if(arr[i].length() % 2 == 0)
            {
                count++;
            }
        }

        // for(int j = 0; j < arr.length; j++)
        // {
        //     if(arr[j].length() % 2 == 0)
        //     {
        //         count++;
        //     }
        // }
        return count;
    }

    
}