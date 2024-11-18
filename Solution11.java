public class Solution11 {
    public static void main(String[] args) {
        int[] height = {1,3,2,5,25,24,5};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            //直接計算面積並更新最大值
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            //移動指針，取決於較小的邊
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}