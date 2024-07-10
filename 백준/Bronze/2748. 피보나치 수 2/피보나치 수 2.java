import java.util.*;
public class Main{
    static long [] dp;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        dp=new long [n+1];
        
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        dp[0]=0;
        dp[1]=1;
        
        
        System.out.println(fibo(n));
    }
    public static long fibo(int n){
        if(dp[n]==-1){
        dp[n]=fibo(n-1)+fibo(n-2);
        }
        return dp[n];
    }
}