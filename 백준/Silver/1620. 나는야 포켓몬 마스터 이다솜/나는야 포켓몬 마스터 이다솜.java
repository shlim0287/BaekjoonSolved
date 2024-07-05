import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        HashMap<String,String> h=new HashMap<>();
        for(int i=0;i<n;i++){
            String p=br.readLine();
            h.put(p,Integer.toString(i+1));
            h.put(Integer.toString(i+1),p);
        }
        for(int i=0;i<m;i++){
            System.out.println(h.get(br.readLine()));
        }
    }
}