import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {

        String sum = "";

        for(int i = 0; i < digits.length; i++ )
        {
            sum = sum + digits[i];
        }

        BigInteger big = new BigInteger(sum);

        BigInteger result = big.add(BigInteger.ONE);

        sum = String.valueOf(result);

        int leg = sum.length();
        
        int arr[] = new int[leg];

         for(int j = 0; j < leg; j++)
         {
            arr[j] = sum.charAt(j)-48;
         }

        return arr;

    }

}