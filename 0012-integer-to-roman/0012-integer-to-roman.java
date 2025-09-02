class Solution {
    public String intToRoman(int num) {
        String [] str ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

         int [] number = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
         String ans ="";
        for(int i = str.length-1; i>=0 ; i--)
        {
            if(num == 0)
            {
                break;
            }
            while(num >= number[i] )
            {
                num -= number[i];
                ans = ans + str[i];
            }
        }
        return ans;

    }
}