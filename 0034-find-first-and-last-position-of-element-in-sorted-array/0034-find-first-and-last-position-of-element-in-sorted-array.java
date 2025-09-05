class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        int arr[] = {-1 , -1};

        boolean first = true, second = true;


        if(nums.length != 0)
        {
            for(int i = 0, j = nums.length-1; i < nums.length; i++,j--)
            {
                if(nums[i] == target && first)
                {
                    arr[0] = i;
                    first = false;
                }
                if((nums[i] == target && first)  && (nums[j] == target && second))
                {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
                if(nums[j] == target && second) 
                {
                    arr[1] = j;
                    second = false;
                }
            }
        }
        // else if(nums.length == 1)
        // {
        //     arr[0] = 0;
        //     arr[1] = 0;
        // }

        return arr;
    }
}