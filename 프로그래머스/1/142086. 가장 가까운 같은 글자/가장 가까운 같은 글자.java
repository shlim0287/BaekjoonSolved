import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int [s.length()];
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            
            if(map.containsKey(str)){
                result[i]=i-map.get(str);
            }else {
                result[i]=-1;
            }
            
            map.put(str,i);
        }
        
        return result;
    }
}