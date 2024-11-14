public class Solution4 {
    public static void main(String[] args) {
        int[] num1 = {1,2,4,7,12};
        int[] num2 = {10,11};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); // 確保 nums1 是較短的陣列
        }
    
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        int halfLen = (m + n + 1) / 2;
    
        while (low <= high) {
            int i = (low + high) / 2;
            int j = halfLen - i;
    
            // 檢查邊界條件
            int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];
    
            // 檢查是否找到正確的分割點
            if (nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
                } else {
                    return Math.max(nums1LeftMax, nums2LeftMax);
                }
            } else if (nums1LeftMax > nums2RightMin) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}
//Two Pointers O(m + n)
// public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//     int m = nums1.length , n = nums2.length;

//     //當其中一邊為空
//     if (m == 0) {
//         if (n % 2 == 0) {
//             return (nums2[n / 2] + nums2[n / 2 - 1]) / 2.0;
//         } else {
//             return nums2[n / 2];
//         }
//     } else if (n == 0) {
//         if (m % 2 == 0) {
//             return (nums1[m / 2] + nums1[m / 2 - 1]) / 2.0;
//         } else {
//             return nums1[m / 2];
//         }
//     }

//     int a = 0 , b = 0;
//     int target = m + n;
//     int[] answer = new int[target/2 + 1];
    
//     for (int i = 0; i <= target / 2; i++) {
//         if (a < m && (b >= n || nums1[a] <= nums2[b])) {
//             answer[i] = nums1[a++];
//         } else {
//             answer[i] = nums2[b++];
//         }
//     }
    
//     if (target % 2 == 0) {
//         return Double.valueOf(answer[target/2]+answer[target/2-1]) / 2;
//     }else{
//         return answer[target/2];
//     }
// }