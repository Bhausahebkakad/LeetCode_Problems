class Solution {
    public String reverseVowels(String s) {

     int start = 0;
     int end = s.length()-1;

     char chArr[] = s.toCharArray();

    while( end > start)
    {  
         char fi = chArr[start];
         char se = chArr[end];
         
        if(!isVowels(chArr[start]))
        {
            start++;
        }
        else if(!isVowels(chArr[end]))
        {
            end--;
        }
        else
        {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp ;
            start++;
            end--;
        }
    }
    return new String(chArr);
    }
    public static boolean isVowels(char fi)
    {
        if(fi == 'a' || fi == 'e' || fi == 'i' || fi == 'o' || fi == 'u' ||
            fi == 'A' || fi == 'E' || fi == 'I' || fi == 'O' || fi == 'U')
            {
                return true;
            }
            return false;
    }
    
}