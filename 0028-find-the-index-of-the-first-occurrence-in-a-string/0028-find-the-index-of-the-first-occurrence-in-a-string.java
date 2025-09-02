class Solution {
    public int strStr(String haystack, String needle) {
        
        int index = 0;
        int j = 0;
        for(int i = 0; i < haystack.length() && j < needle.length();i++)
        { 
            if(haystack.charAt(i) == needle.charAt(j))
            {
                index = i-j;
                j++;
            }
            else
            {   i = i-j;
                j = 0;
                index = 0;
            }
        }
          if(j == needle.length())
            {
              return index;
            }
        return -1;
    }
}