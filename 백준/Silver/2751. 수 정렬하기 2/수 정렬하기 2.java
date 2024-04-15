import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num=Integer.parseInt(br.readLine());
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        for(int i:arr){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}