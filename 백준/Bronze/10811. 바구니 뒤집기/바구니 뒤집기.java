import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int[] arr=new int [n+1];
        
        //바구니 숫자 세팅
        for(int i=1; i<=n;i++){
            arr[i]=i;
        }
        
        //m번 바구니 정렬
        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int q= Integer.parseInt(st.nextToken());
            int w= Integer.parseInt(st.nextToken());
            while(q<w){
                int temp=arr[q];
                arr[q]=arr[w];
                arr[w]=temp;
                q++;
                w--;
            }
        }
        
        //결과 출력
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }    
            
    }
}