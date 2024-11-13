import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,5,8,9,9,8};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            answer ^= num; // XOR 運算
        }

        return answer;
    }
}
// public static int singleNumber(int[] nums) {
//     int answer = 0;

//     List<Integer> numsList = Arrays.stream(nums)
//                                .boxed() // 將 int 轉換成 Integer
//                                .collect(Collectors.toList());

//     for(int i = 0 ; i < nums.length ; i++){
//         if (numsList.indexOf(numsList.get(i)) == numsList.lastIndexOf(numsList.get(i))) {
//             answer = numsList.get(i);
//         }
//     }

//     return answer;
// }