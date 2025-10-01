class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int ans = numBottles;

        // for(int i = 0; i <= numExchange ; i++)
        while(numBottles >= numExchange )
        {
            int exChangeBottles = numBottles/numExchange;

            ans += exChangeBottles;

            numBottles = (numBottles % numExchange) + exChangeBottles;

        }
        return ans ;
    }
}