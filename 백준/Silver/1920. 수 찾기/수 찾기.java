import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<m;i++){
            if(binary(arr,Integer.parseInt(st.nextToken())) >=0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }   
        System.out.println(sb);
    }
    private static int binary(int[] arr, int k){
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = (start + end) / 2;

        if(arr[mid] == k){
            return mid;
        }else if(arr[mid] < k){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
       return -1;
    }
}