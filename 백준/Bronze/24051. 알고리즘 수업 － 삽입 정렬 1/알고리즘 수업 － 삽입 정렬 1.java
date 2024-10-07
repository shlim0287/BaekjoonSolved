import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int [] arr = new int [n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count=0;
        boolean found=false;
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int tobe=i-1;
            
            while(tobe>=0 && arr[tobe]>current){
                arr[tobe+1]=arr[tobe];
                count++;
                
                if(count==k){
                    System.out.println(arr[tobe]);
                    found=true;
                    return;
                }
                
                tobe--;
            }
            if(tobe+1!=i){
              arr[tobe+1]=current;
              count++;
                if(count==k){
                    System.out.println(arr[tobe]);
                    found=true;
                    return;
                }
            }      
        }if(!found){
            System.out.println(-1);
        }
        
    }
}