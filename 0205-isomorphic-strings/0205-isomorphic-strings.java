class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character , Character> map = new HashMap<>();

        if(dublicate(s) == dublicate(t))
        {
            for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(map.containsKey(ch))
            {
                if(!(map.get(ch) == t.charAt(i)))
                {
                    return false;
                }
            }
            map.put(ch , t.charAt(i));
        }
        return true;
        }
        return false;
    }

    public static int dublicate(String s)
    {
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++)
        {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}