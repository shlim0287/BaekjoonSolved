import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean flag=true;
        while(flag){
            st=new StringTokenizer(br.readLine());
            
            int []arr={Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            Arrays.sort(arr);
            if(arr[0]==0&&arr[1]==0&&arr[2]==0){
                flag=false;
                break;
            }
            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}