import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        //檢查空陣列
        if (nums.length == 0) {
            return answer;
        }

        int length = nums.length;
        int first = nums[0];
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < length ; i++){
            if (i == length - 1 || nums[i] + 1 != nums[i + 1]) {
                // 判斷是否為單一數字區間
                if (nums[i] == first) {
                    sb.append(first);
                } else {
                    sb.append(first).append("->").append(nums[i]);
                }
                answer.add(sb.toString());
                sb.setLength(0); // 清空 StringBuilder 內容
                // 更新下一段的起點
                if (i < length - 1) {
                    first = nums[i + 1];
                }
            }
        }

        return answer;
    }
}
