class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        // int arr[] = new int[end+1];
        int gap = end;

        int maxVal = 0;

        while(start < end)
        {
            if(height[start] < height[end])
            {
                // arr[start] = height[start] * gap;
                 maxVal = Math.max(height[start] * gap, maxVal);
                gap--;
                start++;
            }
            else
            {
               maxVal = Math.max(height[end] * gap, maxVal);
                gap--;
                end--;
            }
        }

        // Arrays.sort(arr);

        // return arr[arr.length-1];
         return maxVal;
    }
}