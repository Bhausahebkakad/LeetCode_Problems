class Solution {
    public int minOperations(String s) {
        
        int zero = 0;
        int one = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

           if(i%2 == 0)
           {
             if(ch != '0') zero++;
             if(ch != '1') one++;
           }
           else
           {
             if(ch != '0') one++;
             if(ch != '1') zero++;
           }
        }
        return Math.min(zero , one );
        
    }
}