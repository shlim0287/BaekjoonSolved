import java.util.*;
import java.io.*;
public class Main{
    static int[] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        dp=new int [11];
        for(int i=0;i<=10;i++){
            dp[i]=-1;
        }
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }
    }
    public static int dp(int v){
        if(dp[v]==-1){
            dp[v]=dp(v-3)+dp(v-2)+dp(v-1);
        }
        return dp[v];
    }
}