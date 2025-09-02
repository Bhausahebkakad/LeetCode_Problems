class Solution {
    public String reorderSpaces(String text) {
        
        String arr[] = text.trim().split("\\s+");

        int space = text.length() - text.replaceAll("\\s+","").length();

        if(arr.length == 1)
        {
            return arr[0] + " ".repeat(space);
        }

        int wordSpace = space/(arr.length-1) ;

        int rem = space % (arr.length-1);

        return String.join(" ".repeat(wordSpace), arr) + " ".repeat(rem);
    }
}