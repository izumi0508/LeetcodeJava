import java.util.Arrays;

public class Solution283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    //2ms
    public static void moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                count ++ ;
            }else if (count > 0){
                nums[i-count] = nums[i];
                nums[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(nums));
    }
}
//GPT(Time beats better)1ms
// public void moveZeroes(int[] nums) {
//     int pos = 0; // 用來追踪下一個非零元素應該放置的位置

//     for (int num : nums) {
//         if (num != 0) {
//             nums[pos++] = num; // 將非零數字移動到正確位置
//         }
//     }

//     // 填充剩下的部分為零
//     while (pos < nums.length) {
//         nums[pos++] = 0;
//     }
// }