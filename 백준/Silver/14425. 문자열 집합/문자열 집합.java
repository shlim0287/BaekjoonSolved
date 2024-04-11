import java.util.*;
import java.io.*;
public class Main{
      public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int count=0;

        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        Set<String> set= new HashSet<>();

        for(int i=0;i<a;i++){
            set.add(br.readLine());
        }
        
        for(int i=0;i<b;i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }
        br.close();
        bw.write(count+"");
        bw.flush();
        bw.close();
        
    }
}