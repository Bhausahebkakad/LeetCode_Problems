class Solution {
    public int maxFreqSum(String s) {
        
        Map<Character , Integer> mp =  new HashMap();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(mp.get(ch) == null)
            {
                mp.put(ch , 1);
            }
            else
            {
                mp.put(ch , mp.get(ch)+1);
            }
        }

        int v = 0;
        int c = 0;
      for(Map.Entry<Character , Integer> entry : mp.entrySet())
      {
         char key = entry.getKey();
         int value = entry.getValue();

         if((key == 'a' || key == 'e' || key == 'i' || key=='o' || key == 'u')  && v < value)
            {
                v = value;
            }
        else if((key != 'a' && key != 'e' && key != 'i' && key !='o' && key != 'u') && c < value)
            {
                c = value;
            }
      }

        return v + c;
    }
}