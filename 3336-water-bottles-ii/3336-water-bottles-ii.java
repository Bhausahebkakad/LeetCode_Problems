class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        
        int emptyBottles = numBottles;
        int drunkBottle = numBottles;
        int fullBottles = 0;
        int i = numBottles ;
        while(i >= 0)
        {
           if(emptyBottles >= numExchange)
           {
             fullBottles++;
             emptyBottles -= numExchange;
             numExchange++;
           }
           else
           {
              emptyBottles += fullBottles;
              drunkBottle += fullBottles;
              fullBottles = 0;

           }
           i--;
        }
        return drunkBottle;
    }
}