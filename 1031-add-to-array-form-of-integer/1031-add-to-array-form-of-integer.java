class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n = num.length;
        
        int carry = k;

        LinkedList<Integer> li = new LinkedList();

        int i = n;

        while(--i >= 0 || carry > 0)
        {
            if(i >= 0)
            {
                carry += num[i]; 
            }
            li.addFirst(carry % 10);
            carry = carry/10;
        }
        // Collections.reverse(li);  

        return li;
    }
}