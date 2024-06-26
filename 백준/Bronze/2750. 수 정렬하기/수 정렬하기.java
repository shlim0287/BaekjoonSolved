import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        for(int i=0;i<arr.length-1;i++){
            for(int l=i+1;l<arr.length;l++){
                if(arr[i]>arr[l]){
                    int temp=arr[i];
                    arr[i]=arr[l];
                    arr[l]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}