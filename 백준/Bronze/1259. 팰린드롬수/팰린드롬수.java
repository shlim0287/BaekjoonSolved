import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String line;
         while ((line = br.readLine()) != null && !line.trim().equals("0")){
            String[] arr=line.split("");
            boolean p=true;
            int start=0;
            int end=arr.length-1;
            while(start<end){
                if(!arr[start].equals(arr[end])){
                    p=false;
                    break;
                }else{
                    start++;
                    end--;
                }
            }
             if(p){
                 sb.append("yes").append("\n");
             }else{
                 sb.append("no").append("\n");
             }

        }
        System.out.println(sb.toString());
    }
}