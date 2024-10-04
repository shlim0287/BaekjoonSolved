import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        int[] arr=new int [n+1];
        
        for(int p=0;p<m;p++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            
            for(int o=i;o<=j;o++){
                arr[o]=k;
            }
        }
        
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
                                               
    }
}