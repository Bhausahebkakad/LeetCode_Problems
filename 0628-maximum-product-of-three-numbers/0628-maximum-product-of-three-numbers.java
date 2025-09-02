class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        
        int leg = nums.length;

       return  Math.max(nums[leg-1]*nums[leg-2]*nums[leg-3], nums[0]*nums[1]*nums[leg-1]);
    }
}