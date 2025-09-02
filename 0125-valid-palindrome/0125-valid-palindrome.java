class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuffer str = new StringBuffer(s.toLowerCase());
        
        String com = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57)
            {
                com = com + ch;
            }
        }

        for(int i = 0 , j = com.length()-1; i < com.length()/2; i++,j--)
        {
            if(com.charAt(i) != com.charAt(j))
            {
                return false;
            }
        }

        return true;
    }
}