class Solution {
    public String convertToBase7(int num) {
        
       if(num == 0)
       {
        return "0";
       }

        StringBuilder sb = new StringBuilder();
        boolean neg = (num < 0);

        while(Math.abs(num) > 0 )
        {
            int val = Math.abs(num) % 7;
            sb.insert(0 , val);
            num = num/7;
        }

        if(neg)
        {
           sb.insert(0 , "-");
        }
        return sb.toString();
    }
}