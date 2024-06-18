import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        int [] arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        int start=0;
        int end=0;
        int count=0;
        int sum=0;
        while(true){
            if(sum==M){
                count++;
        }
                
            if(sum>=M){
                sum-=arr[start++];
            }else if(end==N){
                break;
            }else{
                sum+=arr[end++];
            }
    }
        System.out.println(count);
        
}
}