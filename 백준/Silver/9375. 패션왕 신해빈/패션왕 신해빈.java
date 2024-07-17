import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            Map<String,Integer> m=new HashMap<>();
            for(int k=0;k<n;k++){
                st=new StringTokenizer(br.readLine());
                st.nextToken();
                String kind=st.nextToken();
                m.put(kind,m.getOrDefault(kind,0)+1);
                }
            int count=1;
                for(Map.Entry<String,Integer> entry:m.entrySet()){
                    count*=entry.getValue()+1;
                }
            sb.append(count-1 +"\n");
         }
        System.out.print(sb);
    }
}