class Solution {
    public int climbStairs(int n) {
        int result = 0;
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n; i++) {
            int current = 0;
            if (i == 1) {
                current = 1;
            } else if (i == 2) {
                current = 2;
            } else {
                current = x + y; 
            }
            x = y;
            y = current;
        }
        return y;
    }
}

