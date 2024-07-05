import java.util.*;
import java.io.*;
public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] a;
    static int count=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        visited=new boolean[n+1]; 
        a=new ArrayList[n+1];
        
        for(int i=1;i<n+1;i++){
            a[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            a[s].add(e);
            a[e].add(s);
        }
        dfs(1);
        System.out.println(count);
    }
    public static void dfs(int v){
        visited[v]=true;
        for(int i:a[v]){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
    }
}