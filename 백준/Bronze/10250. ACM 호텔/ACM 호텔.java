import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            int h=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            int floor=n%h;
            if(floor == 0) floor = h;
            int room=(n-1)/h + 1;
            System.out.printf("%d%02d\n", floor, room);
        }
    }
}
