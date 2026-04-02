class Solution {
    public static String longestPalindrome(String s) {

    //     if (s == null || s.length() < 1) return "";

    //     int start = 0, end = 0;

    //     for (int i = 0; i < s.length(); i++) {

    //         int len1 = expand(s, i, i);      
    //         int len2 = expand(s, i, i + 1);  

    //         int len = Math.max(len1, len2);

    //         if (len > end - start) {
    //             start = i - (len - 1) / 2;
    //             end = i + len / 2;
    //         }
    //     }

    //     return s.substring(start, end + 1);
    // }

    // public static int expand(String s, int left, int right) {

    //     while (left >= 0 && right < s.length()
    //             && s.charAt(left) == s.charAt(right)) {

    //         left--;
    //         right++;
    //     }

    //     return right - left - 1;

        // String str = s;

        int start = 0;
         int end = 0;
         
         for(int i = 0; i < s.length(); i++)
         {
             char ch = s.charAt(i);
             
             int left = i;
             int right = i;
             
             while(left >=0 && s.charAt(left) == ch)
             {
                 left--;
             }
             while(right < s.length() && s.charAt(right) == ch)
             {
                 right++;
             }
             while(left >=0 && right < s.length())
             {
                 if(s.charAt(left) != s.charAt(right))
                 {
                     break;
                 }
                 left--;
                 right++;
             }
             left++;
             while(end - start < right - left)
             {
                 start = left;
                 end = right;
             }
             
         }
         return s.substring(start , end);
    }

}