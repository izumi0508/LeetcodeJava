public class Solution35 {
    
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8};
        int target = 7;

        int ans = searchInsert(nums,target);
        
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int targetIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] < target) {
                targetIndex++;
            }
        }

        return targetIndex;
    }
    
}
