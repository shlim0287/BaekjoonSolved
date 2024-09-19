class Solution {
    public String solution(int n) {
        StringBuilder sb=new StringBuilder();
        boolean flag =true;
        for(int i=0;i<n;i++){
            if(flag){
                sb.append("수");
                flag=false;
            }else{
                sb.append("박");
                flag=true;
            }
        }
       return sb.toString();
    }
}