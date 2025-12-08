class Solution {
    public int countTriples(int n) {
        
        List<Integer> element = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            element.add(i*i);
        }
        
        System.out.print(element);
        
        
         int count = 0;

        for(int i = 0; i < element.size()-1; i++)
        {
            for(int j = 0; j < element.size(); j++)
            {
            int result = element.get(i) + element.get(j);
            
            // boolean ans = element.contains(result);

            if(element.contains(result) == true)
            {
                count ++;
            }
            }
        }
        return count;
    }
}