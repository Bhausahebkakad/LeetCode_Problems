class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double arr[] = addArray(nums1 , nums2);

        int mid = arr.length/2;

        if((arr.length)%2 != 0)
        {
            return arr[mid];
        }
        
            double ans = arr[mid] + arr[mid-1];
            return ans/2;
        
    }

    public double [] addArray(int a[] , int b[])
    {
        double arr[] = new double[a.length + b.length];

        for(int i = 0; i < a.length; i++)
        {
            arr[i] = a[i];
        }

        for(int i = 0; i < b.length; i++)
        {
            arr[a.length + i] = b[i];
        }

        Arrays.sort(arr);

        return arr;
    }
}