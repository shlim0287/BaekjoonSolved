import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int count=0;
        
        int [] arr=new int [n];
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
            boolean found = false;
        
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        swap(j,j+1,arr);
                        count++;
                    if(count==k){
                        System.out.println(arr[j]+ " " + arr[j+1]);
                        found=true;
                        break;
                        }
                    }
                }if(found) break;
            }
            if(!found){
                System.out.println(-1);
            }

        
    }
    public static void swap(int first,int second,int [] arr){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}