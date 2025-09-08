class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int arr[] = new int[2];

        int start = 1;
        int end = n-1;

        while(start <= end)
        {
            if((start + end) == n)
            {
                // String s1 = String.valueOf(start);
                // String s2 = String.valueOf(end);

                if(!( checkZero(start) || checkZero(end)))
                {
                    arr[0] = start;
                    arr[1] = end;
                    return arr;
                }
            }

            start ++;
            end --;
        }
        return arr;
    }

    public boolean checkZero(int val)
    {
        while(val > 0)
        {
        int last = val % 10;

        if(last == 0) return true;

        val = val/10;
        }
        return false;
    }
}