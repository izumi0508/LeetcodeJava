public class Solution268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length ; i++){
            count += i+1;
            count -= nums[i];
        }

        return count;
    }
}
