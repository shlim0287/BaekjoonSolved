import java.util.*;
import java.io.*;
public class Main{
    static int[] arr;
    static int[] tmp;
    static int n=0;
    static int k=0;
    static int result=-1;
    static int count=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
         n=Integer.parseInt(st.nextToken());
         k=Integer.parseInt(st.nextToken());
        
        arr=new int[n];
        tmp=new int[n];
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        mergeSort(arr,0,arr.length-1);
        
        System.out.println(result);
    }
    public static void mergeSort(int[] arr,int p,int r){
        if(count>k){
            return;
        }
        if(p<r){
            int q=(p+r)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }
    public static void merge(int[] arr,int p,int q,int r){
        int i=p;
        int j=q+1;
        int t=0;
        
        while(i<=q&&j<=r){
            if(arr[i]<arr[j]){
                tmp[t++]=arr[i++];
            }else{
                tmp[t++]=arr[j++];
            }
        }
        
        while(i<=q){
            tmp[t++]=arr[i++];
        }
        while(j<=r){
            tmp[t++]=arr[j++];
        }
        
        i=p;
        t=0;
        while(i<=r){
            count++;
            
            if(count==k){
                result=tmp[t];
                break;
            }
            
            arr[i++]=tmp[t++];
        }
    }
}