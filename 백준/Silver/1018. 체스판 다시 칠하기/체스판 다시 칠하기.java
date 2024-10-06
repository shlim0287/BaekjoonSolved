import java.util.*;
import java.io.*;

public class Main{
            //체커 사용. boolean값으로?
        // 8*8짜리 boolean[][] arr생성.
        // W->true , B->false
    public static boolean[][] arr;
    public static int min=64;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        arr=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<m;j++){
                if(str.charAt(j)=='W'){
                    arr[i][j]=true;
                }else{
                    arr[i][j]=false;
                }
            }
        }
        int nRow=n-7;
        int mCol=m-7;
        
        for(int i=0;i<nRow;i++){
            for(int j=0;j<mCol;j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x,int y){
        int eX=x+8;
        int eY=y+8;
        int count=0;
        
        boolean color=arr[x][y];
        
        for(int i=x;i<eX;i++){
            for(int j=y;j<eY;j++){
                
                if(arr[i][j]!=color){
                    count++;
                }
                
                color=(!color);
            }
            color=!color;
        }
        
        count=Math.min(count,64-count);
        
        min=Math.min(min,count);
    }
}