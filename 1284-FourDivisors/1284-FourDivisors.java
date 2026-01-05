// Last updated: 1/5/2026, 11:24:24 PM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int divSum = 0;

        for (int n : nums) {
            int divCount = 0, inSum = 0;

            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    int other = n / d;

                    if (d == other) {
                        divCount++;
                        inSum += d;
                    } else {
                        divCount += 2;
                        inSum += d + other;
                    }

                    if (divCount > 4)
                        break;
                }
            }

            if (divCount == 4)
                divSum += inSum;
        }

        return divSum;
    }
}