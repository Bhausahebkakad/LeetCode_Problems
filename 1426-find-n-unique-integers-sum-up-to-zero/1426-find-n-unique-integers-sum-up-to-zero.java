class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];

        
       int start = 1;
        int end = n-1;

            if(n%2 !=0 )
            {
                arr[0] = 0;
                while(start < end)
                {
                    arr[start] = start;
                    arr[end] =  -start;
                    start++;
                    end--;
                }
            }
            else
            {
                 while(start <= end)
                 {
                    arr[start-1] = start;
                    arr[end] =  -start;
                    start++;
                    end--;
                 }
            }
        
        return arr;

    }
}