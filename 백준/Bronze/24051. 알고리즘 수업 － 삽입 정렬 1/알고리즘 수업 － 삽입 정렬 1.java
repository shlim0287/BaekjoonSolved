import java.util.*;
import java.io.*;
public class Main{
    static int n=0;
    static int k=0;
    static int[] a;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
       
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        a=new int [n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        
        int result=findK(n,k,a);
        
        System.out.println(result);
    }
    public static int findK(int n,int k, int [] a){
        int saveCount=0;
        for(int i=1;i<n;i++){
            int loc=i-1;
            int newItem=a[i];
            
            while(loc>=0 && newItem<a[loc]){
                a[loc+1]=a[loc];
                loc--;
                saveCount++;
                if(saveCount==k){
                    return a[loc+1];
                }
            }
            if(loc+1!=i){
                a[loc+1]=newItem;
                saveCount++;
                if(saveCount==k){
                    return newItem;
                }
            }
        }
        return -1;
    }
}