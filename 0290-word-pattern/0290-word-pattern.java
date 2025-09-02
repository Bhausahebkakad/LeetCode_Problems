class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String patt[] = pattern.split("");

        String str[] = s.split(" ");

        if(str.length == patt.length)
        {
            
            for(int i = 0; i < pattern.length(); i++)
            {
                for(int j = i+1; j < pattern.length(); j++)
                {
                    if((patt[i].equals(patt[j])  &&  !str[i].equals(str[j]))  
                    || (!patt[i].equals(patt[j])  && str[i].equals(str[j])))
                    
                    {
                        return false;
                    }
                   
                }
            }

        }
        else
        {
            return false;
        }

        return true;
    }
} 