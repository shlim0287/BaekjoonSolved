import java.util.*;
import java.io.*;
public class Main{
    static int dp[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int [n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        dp[0]=0;
        dp[1]=0;
        System.out.println(dp(n));
    }
    public static int dp(int v){
        if(dp[v]==-1){
            if(v%6==0){
                dp[v]=Math.min(dp(v-1),Math.min(dp(v/3),dp(v/2)))+1;
            }else if(v%3==0){
                dp[v]=Math.min(dp(v/3),dp(v-1))+1;
            }else if(v%2==0){
                dp[v]=Math.min(dp(v/2),dp(v-1))+1;
            }else{
                dp[v]=dp(v-1)+1;
            }
        }
        return dp[v];
    }
}