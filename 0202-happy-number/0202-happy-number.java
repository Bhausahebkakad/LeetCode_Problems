class Solution {
    public boolean isHappy(int n) {
    
        int num = n;

        while(num > 3)
        {
            int sum = sum(num);
            if(sum == 1 || sum == 7) return true;
            else if(sum > 1 && sum < 10)return false;
            else num = sum;
        }
        if(n == 1) return true;
        else return false;
    }

    public int sum(int a)
    {
        int sum = 0;
         while(a > 0)
            {
                int last = (a % 10)*(a % 10);
                sum = sum + last;
                a = a/10;
            }
            return sum;
    }
}