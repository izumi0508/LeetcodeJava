public class Solution27 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,4};
        int val = 3;

        int ans = removeElement(nums,val);
        
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        int diffrentCount = 0;
        
        for(int i = 0 ;i < nums.length ;i++){
            if (nums[i] != val) {
                nums[diffrentCount] = nums[i];
                diffrentCount ++;
            }
        }

        return diffrentCount;
    }

}
