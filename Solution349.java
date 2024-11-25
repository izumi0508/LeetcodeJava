import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        // 用 Set 儲存第一個陣列的元素
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // 用 Set 儲存交集
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // 將結果轉換回陣列
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }
}
