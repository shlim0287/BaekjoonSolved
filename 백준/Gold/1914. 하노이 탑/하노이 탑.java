import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        
        int num=Integer.parseInt(br.readLine());
        
        bw.write(BigInteger.TWO.pow(num).subtract(BigInteger.ONE)+"\n");
        if(num<=20){
        hanoi(num,1,2,3);            
        }
        bw.flush();
        bw.close();
    }
    static void hanoi(int num,int start,int mid,int end)throws IOException{
        if(num==1){
           bw.write(start + " " + end + "\n");
            return;
        }

        hanoi(num-1,start,end,mid);                       
        
        bw.write(start + " " + end + "\n");            

        hanoi(num-1,mid,start,end);                
 
    }
}