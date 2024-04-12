import java.util.*;
import java.io.*;
public class Main{
 public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       
       String[] arr=br.readLine().split(" ");
       
       Long sum=0L;
       
       for(int i=0;i<arr.length;i++){
           sum+=Long.parseLong(arr[i]);
       }
       br.close();
       bw.write(sum+" ");
       bw.flush();
       bw.close();
       
   }
}