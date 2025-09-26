class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int arr[] = new int[end+1];
        int gap = end;

        while(start < end)
        {
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