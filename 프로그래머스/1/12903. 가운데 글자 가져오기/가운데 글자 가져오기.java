import java.io.*;
class Solution {
    public String solution(String s) throws IOException{
        StringBuilder sb=new StringBuilder();
        int num=0;
        String[] str=s.split("");
        if(s.length()%2==0){
            num=s.length()/2-1;
            for(int i=num;i<=num+1;i++){
                sb.append(str[i]);
            }
            return sb.toString();
        }else{
            num=s.length()/2;
            return str[num];
        }
    }
}