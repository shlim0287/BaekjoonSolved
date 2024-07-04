import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int m=1;
        int j=1;
        for(int i=n;i>n-k;i--){
            m*=i;
        }
        for(int i=k;i>=1;i--){
            j*=i;
        }
        System.out.println(m/j);
    }
}