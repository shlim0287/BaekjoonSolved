import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb=new StringBuilder();
        String [] arr=String.valueOf(n).split("");
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}