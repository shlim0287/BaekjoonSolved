import java.util.*;
import java.io.*;

public class Main {
    static int[] a;
  
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            visited = new boolean[n + 1];
            a = new int[n + 1];
            
            st = new StringTokenizer(br.readLine());
            for (int k = 1; k <=n; k++) {
                a[k] = Integer.parseInt(st.nextToken());
            }
            
            int count = 0;
            
            for (int k = 1; k <= n; k++) {
                if (!visited[k]) {
                    dfs(k);
                    count++;
                }
            }
                    System.out.println(count);
        }
    }

    public static void dfs(int v) {
        visited[v] = true;
        
        if(!visited[a[v]]){
            dfs(a[v]);
        }
    }
}

