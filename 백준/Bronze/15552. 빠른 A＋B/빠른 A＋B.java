import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat=Integer.parseInt(br.readLine());
        
        for(int i=0;i<repeat;i++){
            String [] nums=br.readLine().split(" ");
            bw.write(Integer.parseInt(nums[0])+Integer.parseInt(nums[1])+"\n");
        }
        br.close();  
        
        bw.flush();
        bw.close(); 
             
    }
    
}