class Solution {
    public int findClosest(int x, int y, int z) {


       int xD = Math.abs(x-z);

       int yD = Math.abs(y-z);

       if(xD < yD)
       {
         return 1;
       }
       else if( xD > yD)
       {
         return 2;
       }

       return 0;
    }
}