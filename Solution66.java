import java.util.Arrays;

public class Solution66 {
    public static void main(String[] args) {
        int[] digits = {9,8,9,9,9};

        int[] ans = plusOne(digits);
        
        System.out.println(Arrays.toString(ans));
    }
    public static int[] plusOne(int[] digits) {
        
        for(int i = digits.length-1 ; i >= 0 ;i--){
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
// for(int i = digits.length-1 ; i >= 0 ;i--){
//     if (digits[i] != 9) {
//         digits[i] += 1;
//         break;
//     }else if(i == 0){
//         digits = new int[digits.length+1];
//         digits[0] = 1;
//         break;
//     }else if(digits[i] == 9 && i != 0){
//         digits[i] = 0;
//     }
// }

// return digits;
//41.31


// for(int i = digits.length-1 ; i >= 0 ;i--){
//     if (digits[i] != 9) {
//         digits[i] += 1;
//         return digits;
//     }else{
//         digits[i] = 0;
//     }
// }
// digits = new int[digits.length+1];
// digits[0] = 1;
// return digits;
//41.36