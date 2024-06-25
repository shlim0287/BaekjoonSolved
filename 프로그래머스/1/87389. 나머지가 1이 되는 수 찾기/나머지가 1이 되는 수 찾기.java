class Solution {
    public int solution(int n) {
        int d=1;
        int answer = 0;
        
        while(d<n){
            if(n%d==1){
                answer=d;
                break;
            }else{d++;}
        }
        return answer;
    }
}