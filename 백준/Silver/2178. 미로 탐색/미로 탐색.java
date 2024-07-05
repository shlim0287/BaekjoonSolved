import java.util.*;
import java.io.*;
public class Main{
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static boolean[][] visited;
    static int[][] a;
    static int n,m;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        a=new int [n][m];
        visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String line=st.nextToken();
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(line.substring(j,j+1));
            }
        }
        bfs(0,0);
        System.out.println(a[n-1][m-1]);
    }
    public static void bfs(int i,int j){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        while(!q.isEmpty()){
            int now[]=q.poll();
            visited[i][j]=true;
            //상하좌우 탐색
            for(int k=0;k<4;k++){
                int x=now[0]+dx[k];
                int y=now[1]+dy[k];
                if(x>=0 && y>=0 && x<n && y<m){ //배열 범위
                    if(a[x][y]!=0 && !visited[x][y]){ // 기 방문 or 0
                        visited[x][y]=true;
                        a[x][y]=a[now[0]][now[1]]+1; //depth ++
                        q.add(new int [] {x,y});
                    }
                }
            }
        }
    }
}