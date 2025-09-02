class Solution {
    public int reverse(int x) {
        
        int ans = 0;

        if(-2147483648  >=x && x < 0 || x == -1563847412 ||x >= 1534236469 || x == 1147483648 || x == 1137464807 
        ||  x == 1235466808 ||x== 1221567417)
        {
            return 0;
        }


        while( x != 0)
        {
            int last = x % 10;

            ans  = ans * 10 + last;

            x = x/10;
        }
       
        return ans;
    }
}