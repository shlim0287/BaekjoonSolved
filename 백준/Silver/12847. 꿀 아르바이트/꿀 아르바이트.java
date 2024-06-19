import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long [] sum=new long [n+1];
        st=new StringTokenizer(br.readLine());
        //구간합 배열
        for(int i=1;i<sum.length;i++){
            sum[i]+=sum[i-1]+Integer.parseInt(st.nextToken());
        }
        // 최대수익 배열
        long max=sum[m];
         for(int i=m;i<=n;i++){
             max=Math.max(max,sum[i]-sum[i-m]);
         }
        System.out.println(max);
    }
}