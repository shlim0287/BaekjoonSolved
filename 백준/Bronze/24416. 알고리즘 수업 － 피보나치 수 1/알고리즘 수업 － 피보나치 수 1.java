import java.io.*;
import java.util.*;
public class Main{
    static int[] topDown;
    static int a=0;
    static int b=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num= Integer.parseInt(br.readLine());
        topDown=new int [num];
        
        fib(num);
        fibDp(num);
        
        bw.write(a+" ");
        bw.write(b+"");
        
        br.close();
        bw.flush();
        bw.close();
          
        
    }
    public static int fib(int num){
        
        if(num==1 || num==2){
            a++;
            return 1;
        }else return (fib(num-1)+fib(num-2));
    }
    public static int fibDp(int num){
        topDown[0] = 1;
        topDown[1] = 1;

        for(int i = 2; i < num; i++){

            b++;
            topDown[i] = topDown[i-1] +topDown[i-2];
        }
        return topDown[num-1];
    }
}