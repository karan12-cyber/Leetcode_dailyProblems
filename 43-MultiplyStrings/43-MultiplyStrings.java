// Last updated: 1/5/2026, 11:25:08 PM


import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        return "" +new BigInteger(num1).multiply(new BigInteger(num2));
    }
}