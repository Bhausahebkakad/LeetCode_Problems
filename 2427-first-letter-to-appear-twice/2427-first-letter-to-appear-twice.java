class Solution {
    public char repeatedCharacter(String s) {
    
    char arr[] = s.toCharArray();

    Set<Character> set = new HashSet();

    for(int i = 0; i < arr.length; i++)
    {
        if(!set.add(arr[i]))
        {
            return arr[i];
        }
    }

    return 0;

    }
}