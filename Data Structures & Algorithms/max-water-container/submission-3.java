class Solution {
    public int maxArea(int[] heights) {
        if (heights.length < 2) {
            return 0;
        }

        var left = 0;
        var right = heights.length - 1;
        var maxArea = 0;
        
        while (left < right) {
            var width = Math.abs(left - right);
            var height = Math.min(heights[left], heights[right]);
            var area = width * height;
            if (area > maxArea) {
                maxArea = area;
            }

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
