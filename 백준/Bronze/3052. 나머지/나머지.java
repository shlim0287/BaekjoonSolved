import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set=new HashSet<>();
        
        for(int i=1;i<=10;i++){
            int num=Integer.parseInt(br.readLine())%42;
            set.add(num);
        }
        System.out.println(set.size());
    }
}