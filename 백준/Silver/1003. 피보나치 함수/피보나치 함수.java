import java.util.*;
import java.io.*;
public class Main{
    static Integer [][]dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        dp=new Integer [41][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        

        for(int i=0;i<t;i++){
            int k=Integer.parseInt(br.readLine());
            fibo(k);
            System.out.println(dp[k][0]+" "+dp[k][1]);

        }
    }
    public static Integer[] fibo(int v){
        if(dp[v][0]==null || dp[v][1]==null){
            dp[v][0]=fibo(v-1)[0]+fibo(v-2)[0];
            dp[v][1]=fibo(v-1)[1]+fibo(v-2)[1];
        }
        return dp[v];
    }
}