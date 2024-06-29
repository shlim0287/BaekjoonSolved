import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0;i<a;i++){
            int b=Integer.parseInt(st.nextToken());
            if(isPrime(b)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int b){
        if (b <= 1) return false;
        if(b==2){
            return true;
        }if(b%2==0){
            return false;
        }
        
        for(int i=3;i<=Math.sqrt(b);i+=2){
            if(b%i==0)return false;
        }
        return true;
    }
}