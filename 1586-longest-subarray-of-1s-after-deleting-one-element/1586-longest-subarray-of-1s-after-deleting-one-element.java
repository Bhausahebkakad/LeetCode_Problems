class Solution {
    public int longestSubarray(int[] nums) {
        
        int prev = 0, curr = 0, ans = 0;

        for(int i : nums)
        {
            if(i == 1)
            {
                curr++;
            }
            else
            {
                ans = Math.max(ans , prev + curr);
                prev = curr;
                curr = 0;
            }
        }

        ans = Math.max(ans , prev + curr);

        return ans == nums.length ? ans-1 : ans;
    }
}