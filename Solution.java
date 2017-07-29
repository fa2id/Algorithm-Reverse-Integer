/**
 * Created by Farid on 2017-07-28.
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * 1000000003 This is a example input for the overflow.
 */
public class Solution {

    public int reverse(int x) {
        String intString = Integer.toString(x);
        StringBuilder SB = new StringBuilder();
        SB.append(intString);
        SB.reverse();
        String resultString;
        if (SB.toString().endsWith("-")){
            SB.insert(0,"-");
            SB.substring(0,SB.length()-1);
            resultString = SB.toString().substring(0,SB.length()-1);
        }
        else {
            resultString = SB.toString();
        }
        Long result = Long.parseLong(resultString);
        if (result>Integer.MAX_VALUE ||result<Integer.MIN_VALUE)
            result = Long.valueOf(0);
        return Math.toIntExact(result);
    }

    public static void main(String[] args) {
        
        Solution SL = new Solution();

        System.out.println(SL.reverse(-321));
        System.out.println(SL.reverse(5678));
    }
}
