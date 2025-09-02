class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;

        for(int i = 0 ; i < columnTitle.length(); i++)
        {
            char ch = columnTitle.charAt(i);

            result =(result * 26 + (int)ch - 65) + 1;
        }

        return result;
    }
}