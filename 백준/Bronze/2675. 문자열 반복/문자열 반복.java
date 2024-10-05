import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            
           for(int k=0;k<str.length();k++){
               for(int l=0;l<repeat;l++){
                  System.out.print(str.charAt(k)); 
               }
           } 
            System.out.println();
        }
    }
}