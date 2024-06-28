import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<a;i++){
            String s=br.readLine();
            int score=0;
            Stack<Character> stack=new Stack<>();    
            
            for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='O'){
                stack.push('O');
                score+=stack.size();
            }else{
                stack.clear();
                }
            }
            sb.append(score+"\n");
        }
        System.out.println(sb.toString());
    }
}