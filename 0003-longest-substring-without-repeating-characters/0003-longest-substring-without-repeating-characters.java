class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         String ans = "";

        for(int i = 1, j = 0; i <= s.length(); i++)
        {
            String checkResult = s.substring(j,i);

            boolean repit = checkRepating(checkResult);

            if(repit == true && checkResult.length() > ans.length())
            {
                ans = checkResult;
            }
            else if(!repit)
            {
                j ++;
                i = j + 1;
            }
        }

        return ans.length();
    }

    public boolean checkRepating(String str)
    {
        int freq[] = new int[256];

        for(int i=0; i < str.length(); i++)
        {
            freq[str.charAt(i)]++;
        }

        for(int i = 0; i < 256; i++)
        {
            if(freq[i] > 1)
            {
                return false;
            }
        }
        return true;
    }

    
}