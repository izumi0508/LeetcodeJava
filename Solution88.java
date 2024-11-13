import java.util.Arrays;

public class Solution88 {
    public static void main(String[] args) {
        int m = 0;
        int n = 1;
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int[] ans = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(ans));
    }

    //0ms 100%,42.04MB 61.42%
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        // 當 nums2 為空，直接返回
        if (n == 0) {
            return nums1;
        }
        
        // 指向 nums1 和 nums2 的尾部
        int p1 = m - 1; // nums1 的有效元素最後一個索引
        int p2 = n - 1; // nums2 的最後一個索引
        int p = m + n - 1; // 合併後陣列的最後一個索引
        
        // 開始從後向前合併
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // 如果 nums2 還有剩餘元素，複製到 nums1 的前段
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

        return nums1;
    }

}


// if (n == 0) {
            
// }else if (m == 0) {
//     System.arraycopy(nums2, 0, nums1, 0, nums2.length); 
// }else{
//     for(int i = 0; i < n ; i++){
//         nums1[i+m] = nums2[i];
//     }
//     Arrays.sort(nums1, 0, m+n);
// }
//1ms Beats 28.92% ,42.44MB 9.69%
