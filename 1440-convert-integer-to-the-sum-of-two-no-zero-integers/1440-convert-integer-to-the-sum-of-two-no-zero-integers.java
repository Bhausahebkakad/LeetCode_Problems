class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int arr[] = new int[2];

        int start = 1;
        int end = n-1;

        while(start <= end)
        {
            if((start + end) == n)
            {
                String s1 = String.valueOf(start) + String.valueOf(end);
                // String s2 = String.valueOf(end);

                if(!(s1.contains("0")))
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
}