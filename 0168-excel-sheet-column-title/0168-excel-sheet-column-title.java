class Solution {
    public String convertToTitle(int columnNumber) {
        
        int val = columnNumber;

        StringBuilder b = new StringBuilder();

        while(val > 0)
        {
            
                int r = (val - 1) % 26;
                b.append((char)(r +'A')) ;  
                val = (val-1)/26;
            
        }

        return b.reverse().toString() ;

    }
}