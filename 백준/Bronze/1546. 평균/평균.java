import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        double[] arr=new double[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
			arr[i]=Double.parseDouble(st.nextToken());
		}
        
        //합 구하기,최댓값 찾기
        double sum=0;
        
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum+=(arr[i]/arr[n-1])*100;
        }
        
        System.out.println(sum/n);
    }
}