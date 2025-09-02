class Solution {
    public int lastStoneWeight(int[] stones) {

        int leg = stones.length;

        while(leg > 1)
        {
            Arrays.sort(stones);
           
                 int diff = stones[leg-1] - stones[leg-2];

                 stones[leg-2] = diff;

                 stones = Arrays.copyOf(stones , leg-1);
                 leg--;
            
        }

        return stones[0];



        // Using list and stream api 

        // List<Integer> li = Arrays.stream(stones).boxed().sorted().collect(Collectors.toList());

        // while(li.size() > 1)
        // {
        //     int last =li.size()-1;
        //     int secLast =li.size()-2;
        //     int diff = li.get(last) - li.get(secLast);

        //     li.remove(last);
        //     li.set(secLast , diff);

        //     Collections.sort(li);
        // }

        // return li.get(0);
    }
}