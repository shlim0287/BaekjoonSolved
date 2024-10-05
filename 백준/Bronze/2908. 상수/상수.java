import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        
        String[] num1=st.nextToken().split("");
        String[] num2=st.nextToken().split("");
        
        int start=0;
        int end=num1.length-1;
        while(start<end){
            String temp1=num1[start];
            String temp2=num2[start];
            
            num1[start]=num1[end];
            num2[start]=num2[end];
            num1[end] = temp1;
            num2[end] = temp2;
            
            start++;
            end--;
        }
        for(int i=0;i<num1.length;i++){
            sb.append(num1[i]);
            sb2.append(num2[i]);
        }
        
        
        
        System.out.println(Math.max(Integer.parseInt(sb.toString()),Integer.parseInt(sb2.toString())));
        
    }
}