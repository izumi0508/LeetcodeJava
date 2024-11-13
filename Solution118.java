import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static void main(String[] args) {
        int numRows = 10;
        List<List<Integer>> answer = new ArrayList<>();
        answer = generate(numRows);
        System.out.println(answer);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        // 處理每一行
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // 第一個元素永遠是1
            row.add(1);

            // 計算每行的元素
            for (int j = 1; j < i; j++) {
                // 取上面行的兩個元素相加
                int left = answer.get(i - 1).get(j - 1);
                int right = answer.get(i - 1).get(j);
                row.add(left + right);
            }

            // 除了第一個元素，最後一個元素也是1
            if (i > 0) {
                row.add(1);
            }

            answer.add(row);
        }

        return answer;
    }
}
