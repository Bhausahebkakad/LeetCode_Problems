class Solution {
    public int triangularSum(int[] nums) {
        
        while(nums.length > 1)
        {
            int arr1[] = combinations(nums);

            if(arr1.length == 1)
            {
                return arr1[0];
            }
            nums = arr1;
        }
        return nums[0];
    }

    public int[] combinations(int a[])
    {
        int arr[] = new int[a.length-1];

        for(int i = 0; i < a.length-1; i++)
        {
            int sum = (a[i] + a[i+1])%10;

            if(sum >= 10)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = sum;
            }
        }
        return arr;
    }
}