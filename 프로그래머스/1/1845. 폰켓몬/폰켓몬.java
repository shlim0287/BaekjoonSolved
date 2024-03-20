import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int halfNum = nums.length / 2;
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        if(halfNum>hash.size()){
            return hash.size();
        } else {
            return halfNum;
        }
    }
}