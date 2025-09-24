class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.split(" ");

        for(int i = 0; i < arr.length; i++)
        {
            // String ans = reverse(arr[i]);

            StringBuilder sb = new StringBuilder(arr[i]);

            arr[i] = sb.reverse().toString();
        }

        return String.join(" ", arr);
    }

    public String reverse(String str)
    {
        String ans = "";

        for(int i = str.length()-1; i >= 0; i--)
        {
            ans = ans + str.charAt(i);
        }

        return ans;
    }
}