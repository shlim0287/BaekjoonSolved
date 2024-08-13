import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        for(int i=1;i<=a;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+": "+(b+c));
        }
    }
}