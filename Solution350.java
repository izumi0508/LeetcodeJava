import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution350 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1,3,4,1,5};
        int[] nums2 = {2,2,6,3,1,1};

        int[] intersection = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        // 使用 HashMap 儲存 nums1 的元素和出現次數
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 儲存交集結果
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1); // 減少該元素的計數
            }
        }

        // 將 List 轉換為陣列
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}
