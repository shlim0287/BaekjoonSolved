import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String given = br.readLine();
        br.close();

        Set<String> set=new HashSet<>();

        for(int i=0;i<given.length();i++){
            for(int j=i+1;j<=given.length();j++){
                set.add(given.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}