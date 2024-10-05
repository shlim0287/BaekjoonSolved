import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arrA=new int[n][m];
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arrA[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                sb.append(arrA[i][j]+Integer.parseInt(st.nextToken())+" ");
            }
                sb.append("\n");
            
        }
        System.out.println(sb);
        

        
        
    }
}