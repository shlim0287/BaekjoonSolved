import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());

        if(num==1){
            System.out.println(0);
            return;
        }
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        
        for(int i=0;i<num;i++){
           StringTokenizer st=new StringTokenizer(br.readLine());
           int x=Integer.parseInt(st.nextToken());
           int y=Integer.parseInt(st.nextToken());
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        
        long area=(long)(maxX-minX)*(maxY-minY);
        System.out.println(area);
        
    }
}