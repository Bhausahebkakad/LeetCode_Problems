class Solution {
    public int makeTheIntegerZero(int num1, int num2) {

        for(int k = 1; k <= 60 ; k++ )
        {
            long target = num1 - (long) num2 * k;

            if(target < k) return -1;

            if(k >= Long.bitCount(target)) return k;
        }
        return -1;
    }
}