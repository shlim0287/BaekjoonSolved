import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n;i>0;i--){
            if(n%i==0){
                list.add(i);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}