class Solution {
    public int countSegments(String s) {

        int result = 0 ;
        String str[] = s.split(" ");

        for(int i = 0; i < str.length; i++)
        {
            if(!str[i].trim().isEmpty())
            {
                result++;
            }
        }
        return result;
    }
}