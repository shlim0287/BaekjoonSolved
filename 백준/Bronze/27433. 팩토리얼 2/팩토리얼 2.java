import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println(factorial(num));
    }
    public static long factorial(long num){
        if(num==0||num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}