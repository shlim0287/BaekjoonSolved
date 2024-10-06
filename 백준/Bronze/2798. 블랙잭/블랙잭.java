import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        
        int [] arr=new int [n];
        
        st=new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int result=0;
        
        for(int i=0;i<n-2;i++){
            for(int k=i+1;k<n-1;k++){
                for(int j=k+1;j<n;j++){
                    int sum=arr[i]+arr[k]+arr[j];
                    
                    //합 m 안넘고, 현재결과보다 크면 갱신
                    if(sum<=m && sum>result){
                        result=sum;
                    }
                    //값 일치면 종료
                    if(result==m){
                        System.out.println(result);
                        return;
                    }
                }
            }
        }
        System.out.println(result);
        
        
        
    }
}