// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.
import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    //boyer-moore voting algorithm
    public static int majorityElement(int[] nums) {
        return vote(nums, 0, nums[0]);
    }
    
    static int vote(int[] nums ,int from ,int ref){
        int count = 0;
        for(int i = from ; i < nums.length ; i++){
            if(ref == nums[i]){
                count ++;
            }else{
                count --;
            }

            if (count == -1) {
                return vote(nums, i+1, nums[i]);
            }
        }
        return ref;
    }
}
//HashMap

// public static int majorityElement(int[] nums) {
//     HashMap<Integer, Integer> frequencyMap = new HashMap<>();

//     for (int num : nums) {
//         frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
//     }
    
//     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//         int key = entry.getKey();
//         int value = entry.getValue();
        
//         if (value > nums.length / 2) {
//             return key;
//         }
//     }

//     return 0;
// }