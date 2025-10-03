class Solution {
    public int trap(int[] height) {

        int n = height.length;
        if(n == 0) return 0;

        int lmaxArr[] = new int[n];
        int rmaxArr[] = new int[n];

        lmaxArr[0] = height[0];
        rmaxArr[n-1] = height[n-1];

        for(int i = 1; i < n; i++)
        {
            lmaxArr[i] = Math.max(lmaxArr[i-1], height[i]);

        }

         for(int i = n-2; i >=0; i--)
        {
            rmaxArr[i] = Math.max(rmaxArr[i+1], height[i]);
        }
        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            ans += Math.min(lmaxArr[i], rmaxArr[i]) - height[i];
        } 
        return ans;     
    }
}