class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int arr[] = new int[101];

        for(int i = 0; i < nums.length; i++)
        {
            arr[nums[i]]++;
        }

        Arrays.sort(arr);

        int count = 0;

        for(int j = arr.length-1; j > 1; j--)
        {
            if(arr[j] == arr[j-1])
            {
                count = count + arr[j];
            }
            else
            {
                return count = count + arr[j];
            }
        }

        return count;
    }
}