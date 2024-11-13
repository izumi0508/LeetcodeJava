import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public static void main(String[] args) {
        int rowIndex = 10;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();

        long value = 1;
        for (int j = 0; j <= rowIndex; j++) {
            answer.add((int) value);
            value = value * (rowIndex - j) / (j + 1);
        }

        return answer;
    }
}

