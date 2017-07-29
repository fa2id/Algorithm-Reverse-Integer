/**
 * Created by Farid on 2017-07-28.
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows
 * 1000000003 This is a example input for the overflow
 **********************************
 * Determine whether an integer is a palindrome. Do this without extra space.
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

    public boolean isPalindrome(int x) {
        if (x<0)return false;
        String string = Integer.toString(x);
        int pointerForward = 0;
        int pointerBackward = string.length()-1;
        boolean identical = false;

        while (pointerForward<=pointerBackward){
            if(string.charAt(pointerForward) == string.charAt(pointerBackward)){
                identical = true;
            }
            else {
                return false;
            }
            pointerForward++;
            pointerBackward--;
        }
        return identical;

    }

    public static void main(String[] args) {
        Solution SL = new Solution();

        System.out.println(SL.reverse(-321));
        System.out.println(SL.isPalindrome(0));
    }

}
