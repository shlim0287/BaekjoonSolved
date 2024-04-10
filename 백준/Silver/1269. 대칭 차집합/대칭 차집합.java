import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        
        st=new StringTokenizer(br.readLine());
        for (int i=0;i<a;i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }
        
        int count=0;
        for(int c:setA){
            if(!setB.contains(c)){
                count++;
            }
        }
        for(int c:setB){
            if(!setA.contains(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}