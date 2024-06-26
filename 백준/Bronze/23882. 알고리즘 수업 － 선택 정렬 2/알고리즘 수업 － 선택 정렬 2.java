import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int[] arr=new int [n];
        int k=Integer.parseInt(st.nextToken());
        int count=0;
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        for(int i=n-1;i>=0;i--){
            int max=0;
            int idx=0;
            for(int l=0;l<i;l++){
                if(max<arr[l]){
                    max=arr[l];
                    idx=l;
                }
            }
            if(arr[i]<arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                count++;
            }
            if(count==k){
                break;
            }
        }
        if(count<k){
            System.out.println(-1);
        }else{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
