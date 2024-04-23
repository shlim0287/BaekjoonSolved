import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String [] str=s.split("");
        int [] arr=new int [str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        
    }
}