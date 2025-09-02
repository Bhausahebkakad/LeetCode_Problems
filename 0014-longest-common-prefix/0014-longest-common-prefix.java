class Solution {
    public String longestCommonPrefix(String[] strs) {
        
            String result ="";
            Arrays.sort(strs);

            char[] f = strs[0].toCharArray();
            char[] s = strs[strs.length-1].toCharArray();

            for(int i = 0 ;i < f.length;i++)
            {
                if(f[i] != s[i])
                {
                    break;
                }

                result = result + f[i];

            }

            return result;
            
    }
}