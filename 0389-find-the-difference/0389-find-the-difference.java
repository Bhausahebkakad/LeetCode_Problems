class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
           sum = sum + t.charAt(i);
           sum = sum - s.charAt(i);
        }
        return (char)(sum + t.charAt(t.length()-1)); 
    }
}