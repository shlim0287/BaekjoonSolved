import java.util.*;
import java.io.*;

public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] a;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); //노드
        int m = Integer.parseInt(st.nextToken());// 에지
        
        visited=new boolean[n+1]; // 인덱스 1번부터 고려
        
        a= new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            a[i]=new ArrayList<>();
        }
        
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); 
            int e = Integer.parseInt(st.nextToken());
            a[s].add(e);
            a[e].add(s);
        }
        int count = 0;
        
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
       
    }
    private static void dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(int i:a[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
    
}