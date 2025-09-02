class Solution {
    public boolean rotateString(String s, String goal) {
        
        char arr[] = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
        {
            char str = arr[0];

            for(int j = 0; j < s.length()-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[s.length()-1] = str;

            String ans = new String(arr);

            if(ans.equals(goal))
            {
                return true;
            }
        }
        return false;
    }
}