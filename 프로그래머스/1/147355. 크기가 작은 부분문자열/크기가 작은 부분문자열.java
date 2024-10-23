class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength=p.length();
        for(int i=0;i<=t.length()-pLength;i++){
            String temp=t.substring(i,i+pLength);
            if(Long.parseLong(temp)<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}