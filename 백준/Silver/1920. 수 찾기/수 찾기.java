import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int [] Narr=new int[n];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<Narr.length;i++){
             Narr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Narr); // 이진탐색을 위한 정렬
        
        
        int m= Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
             
             boolean find=false;
             int target=Integer.parseInt(st.nextToken());
            
            int start=0;
            int end=Narr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                int mid_value=Narr[mid];
                if(mid_value>target){
                    end=mid-1;
                }else if(mid_value<target){
                    start=mid+1;
                }else{
                    find=true;
                    break;
                }
            }
            if(find)System.out.println(1);
            else System.out.println(0);
        }
       
    }
}