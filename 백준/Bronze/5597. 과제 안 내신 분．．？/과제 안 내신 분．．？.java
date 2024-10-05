import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr=new boolean[31];
        
        for(int i=1;i<=28;i++){
            int st=Integer.parseInt(br.readLine());
            arr[st] = true;
        }
        
        for(int i=1;i<=30;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
        
    }
}