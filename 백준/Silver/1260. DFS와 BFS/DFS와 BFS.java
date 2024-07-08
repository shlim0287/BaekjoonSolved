import java.util.*;
import java.io.*;
public class Main{
    static ArrayList<Integer>[] a;
    static boolean[] visited;
    static int n,m,v;
    static StringBuilder sb;
    
    
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        v=Integer.parseInt(st.nextToken());
        
        visited=new boolean[n+1];
        a=new ArrayList[n+1];
        sb=new StringBuilder();
        
        for(int i=0;i<a.length;i++){
            a[i]=new ArrayList<>();
        }
        
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            
            a[s].add(e);
            a[e].add(s);
        }
        for(int i=0;i<a.length;i++){
            Collections.sort(a[i]);
        }
        
        dfs(v);
        visited=new boolean [n+1];
        sb.append("\n");
        bfs(v);
        System.out.println(sb.toString());
    }
    public static void dfs(int v){
        visited[v]=true;
        sb.append(v+" ");
        for(int i:a[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int v){
        Queue<Integer> q=new LinkedList<>();
        visited[v]=true;
        q.add(v); 
        while(!q.isEmpty()){
            int num=q.poll();
            sb.append(num+" ");
            for(int i:a[num]){
                if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
}