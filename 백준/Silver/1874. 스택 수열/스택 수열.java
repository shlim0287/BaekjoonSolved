import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        
        int n=Integer.parseInt(br.readLine());
        
        int start=1;
        boolean flag=true;
        for(int i=0;i<n;i++){
            int su=Integer.parseInt(br.readLine());
            if(su>=start){
                while(su>=start){
                stack.push(start++);
                sb.append("+\n");    
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int k=stack.pop();
                if(k>su){
                    System.out.println("NO");
                    flag=false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }

        }
        if(flag)System.out.println(sb.toString());
    }
}