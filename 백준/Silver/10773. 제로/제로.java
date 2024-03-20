import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        int num=Integer.parseInt(br.readLine());
        int sum=0;

        for(int i=0;i<num;i++){
            int input = Integer.parseInt(br.readLine());
            if(input!=0){
                stack.push(input);
            }else{
                stack.pop();
            }
        }

        for (Integer a : stack) {
            sum+=a;
        }
        System.out.println(sum);
        
    }
}