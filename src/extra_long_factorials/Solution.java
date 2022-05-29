package extra_long_factorials;

import java.math.BigInteger;

class Solution {
    public static void main(String[] args) {
        int n = 25;
        BigInteger a = new BigInteger("1");
        for (int i = 1; i  <n; i++) {
            a = a.multiply(BigInteger.valueOf(i+1));
        }
        System.out.println(a);
    }
}