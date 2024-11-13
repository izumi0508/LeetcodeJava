import java.util.HashSet;
import java.util.Set;

public class Solution219 {
    public static void main(String[] args) {
        int[] nums = {99,9};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums , k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // 使用 HashSet 來記錄滑動窗口內的數字
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // 如果超過範圍 k，則移除最左邊的元素
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            // 如果 HashSet 中已經存在該數字，表示在範圍 k 內有重複
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}
// for(int j = 0 ; j < nums.length; j++){
//     for(int i = j + 1 ; i - j <= k ; i++){
//         if(i >= nums.length){
//             break;
//         }
//         if(nums[i] == nums[j]){
//             return true;
//         }
//     }
// }

// return false;