import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue=new LinkedList<>();

        for(int i=1;i<=num;i++){
            queue.add(i);
        }
        
        while(queue.size()!=1){
            queue.poll();
            Integer second = queue.poll();
            queue.add(second);
        }
        System.out.println(queue.peek());
        
    }
}