import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
       
        
        Integer[] nums = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i];
        }


        Arrays.sort(nums, (a, b) -> {
            String order1 = String.valueOf(a) + String.valueOf(b);
            String order2 = String.valueOf(b) + String.valueOf(a);
            return order2.compareTo(order1);
        });


        if (nums[0] == 0) {
            return "0";
        }


        StringBuilder largest = new StringBuilder();
        for (int num : nums) {
            largest.append(num);
        }

        return largest.toString();
    }
}