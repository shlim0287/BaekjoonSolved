import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num =Integer.parseInt(br.readLine());
        int[][] arr=new int [num][2];

        StringTokenizer st;
        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0];
            }
        });
        

        
        for(int i=0;i<num;i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}