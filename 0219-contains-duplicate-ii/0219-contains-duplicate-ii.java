class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // for(int i = nums.length-1; i >= 0; i--)
        // {
        //     for(int j = i-1; j >= 0; j--)
        //     {
        //         if(nums[i] == nums[j]  && (i-j) <= k)
        //         {
        //             return true;
        //         }
        //     }
        // }

        Map<Integer, Integer> hs = new HashMap();


        for(int i = 0; i < nums.length; i++)
        {
            if(!hs.containsKey(nums[i]))
            {
                hs.put(nums[i], i);
            }
            else
            {
                int pindex = hs.get(nums[i]);

                if(Math.abs(pindex - i) <= k)
                {
                    return true;
                }
                else
                {
                    hs.put(nums[i] , i);
                }
            }
        }

        return false;
    }
}