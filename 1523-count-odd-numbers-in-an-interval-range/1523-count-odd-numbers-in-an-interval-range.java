class Solution {
    public int countOdds(int low, int high) {
        
        int count = 0;
        if(low == high)
        {
            return low%2 !=0 ? 1 : 0;
        }

       else if(low%2 !=0 && high%2 !=0)
        {
            return 2 + (high-low-1)/2;
        }
        else if(low%2 !=0 || high%2 !=0)
        {
            return 1+(high-low)/2;
        }

        return (high-low)/2;
    }
}