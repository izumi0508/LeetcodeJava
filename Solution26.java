public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {-1,0,0,1,1,2,3};

        int ans = removeDuplicates(nums);
        
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        
        for(int i = 1 ;i < nums.length ;i++){
            if (nums[i] != nums[i-1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount ++;
            }
        }

        return uniqueCount;
    }
}
