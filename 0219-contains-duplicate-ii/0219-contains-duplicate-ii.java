class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> hs = new HashMap();

        for(int i = 0; i < nums.length; i++)
        {
            if(hs.containsKey(nums[i]))
            {
                int pindex = hs.get(nums[i]);

                if(i - pindex <= k)
                {
                    return true;
                }
            }
            
             hs.put(nums[i] , i);
        }

        return false;
    }
}