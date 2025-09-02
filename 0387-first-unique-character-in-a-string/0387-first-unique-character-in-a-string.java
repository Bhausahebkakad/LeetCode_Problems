class Solution {

    public int firstUniqChar(String s) {

        
        int arr[] = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            arr[ch - 'a']++;
        }

        for(int j = 0; j < s.length(); j++)
        {
            int ch = s.charAt(j) - 'a';

            if(arr[ch] == 1)
            {
                return j;
            }
        }
        return -1;
    }
}