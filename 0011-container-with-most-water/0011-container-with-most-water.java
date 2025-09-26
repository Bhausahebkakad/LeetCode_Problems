class Solution {
    public int maxArea(int[] height) {
        
        int arr[] = new int[height.length];
        int gap = height.length-1;

        int start = 0;
        int end = height.length-1;

        while(start < end)
        {
            // int min = Math.min(height[start], height[end]);

            if(height[start] < height[end])
            {
                arr[start] = height[start] * gap;
                gap--;
                start++;
            }
            else
            {
                arr[end] = height[end] * gap;
                gap--;
                end--;
            }
        }

        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}