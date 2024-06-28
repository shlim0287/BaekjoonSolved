import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int [8];
        for(int i=0;i<8;i++){
            int a=Integer.parseInt(st.nextToken());
            arr[i]=a;
        }
        boolean flagA=true;
        boolean flagD=true;
        
        for(int i=0;i<arr.length-1;i++){
            int start=i;
            int end=start+1;
            if(arr[start]<arr[end]){
                flagD=false;
            }else if(arr[start]>arr[end]){
                flagA=false;
            }
        }
        if(flagA){
            System.out.println("ascending");
        }else if(flagD){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}