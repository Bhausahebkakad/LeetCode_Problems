class Solution {
    public int lastStoneWeight(int[] stones) {

        List<Integer> li = Arrays.stream(stones).boxed().sorted().collect(Collectors.toList());

        while(li.size() > 1)
        {
            int last =li.size()-1;
            int secLast =li.size()-2;
            int diff = li.get(last) - li.get(secLast);

            li.remove(last);
            li.set(secLast , diff);

            Collections.sort(li);
        }

        return li.get(0);
        
    }
}