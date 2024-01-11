import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        double arr[]=new double[Integer.parseInt(br.readLine())];
        
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Double.parseDouble(st.nextToken());
        }
        double sum=0;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]/arr[arr.length-1])*100;
        }
        System.out.println(sum/arr.length);
    }
}