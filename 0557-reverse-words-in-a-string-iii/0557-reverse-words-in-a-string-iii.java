class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.split(" ");

        for(int i = 0; i < arr.length; i++)
        {

            StringBuffer sb = new StringBuffer(arr[i]);

            arr[i] = sb.reverse().toString();
        }

        return String.join(" ", arr);
    }
}