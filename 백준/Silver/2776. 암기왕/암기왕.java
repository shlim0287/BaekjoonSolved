import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            HashSet<Integer> note1 = new HashSet<>();
            st = new StringTokenizer(br.readLine());
           
            for(int j = 0; j < n; j++){
                note1.add(Integer.parseInt(st.nextToken()));
            }
            
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            for(int k = 0; k < m; k++){
                int r = Integer.parseInt(st.nextToken());
                bw.write(note1.contains(r) ? "1\n" : "0\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}