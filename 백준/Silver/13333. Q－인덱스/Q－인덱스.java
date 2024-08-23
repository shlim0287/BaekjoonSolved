import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int [] arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int idx=0;
        for(int i=0;i<n;i++){
            int k=n-i;
            if(arr[i]>=k){
                idx=k;
                break;
            }
        }
        System.out.println(idx);
    }
}