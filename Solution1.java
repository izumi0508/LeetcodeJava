import java.util.Arrays;

class Solution1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        
        int target = 9;

        int[] ans = twoSum(nums, target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i == j){
                    break;
                }else if(nums[i] + nums[j] == target){
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }
        
        return ans;
    }
}
