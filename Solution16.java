import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        int target = 100;
        threeSumClosest(nums,target);
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            // 避免重複元素
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int currentDiff = Math.abs(target - sum);
                int bestDiff = Math.abs(target - result);   

                // 更新最接近目標值的結果
                if (currentDiff < bestDiff) {
                    result = sum;
                }

                if (sum == target) {
                    return sum; // 提前結束
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(result);
        return result;
    }
}
