import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int get=nums.length/2;
        int answer = 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        answer=Math.min(get,set.size());
        return answer;
    }
}