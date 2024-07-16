import java.util.*;
import java.io.*;
public class Main{
    static Long [] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        dp=new Long[101];
        dp[1]=1L;
        dp[2]=1L;
        dp[3]=1L;
        dp[4]=2L;
        dp[5]=2L;
        
        for(int i=6;i<=100;i++){
            dp[i]=dp[i-1]+dp[i-5];
        }
        for(int i=0;i<n;i++){
           int a=Integer.parseInt(br.readLine());
            System.out.println(dp[a]);
        }
        
    }

}