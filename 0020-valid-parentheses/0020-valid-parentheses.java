class Solution {
    public boolean isValid(String str) {
        
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++)
        {    
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
            {
                s.push(str.charAt(i));
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                char top = s.peek();
                if(str.charAt(i) == '}' && top == '{'
                 || str.charAt(i) == ')' && top == '(' 
                 || str.charAt(i) == ']' && top == '[')
                 {
                    s.pop();
                 }
                 else
                 {
                    return false;
                 }
            }
           
        } return s.isEmpty();
    }
}