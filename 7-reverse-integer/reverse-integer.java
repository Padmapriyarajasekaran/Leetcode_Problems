class Solution {
    public int reverse(int x) {
        int sum =0;
        while(x!=0){
            int a = x%10;
            // Check for overflow before actually multiplying
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && a > 7)) {
                return 0;
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && a < -8)) {
                return 0;
            }
            sum = sum *10 +a;
            x = x/10;
        }
        return sum;
    }
}