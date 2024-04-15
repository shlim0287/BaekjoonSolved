import java.util.*;
import java.io.*;
public class Main{
      public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();

        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<num;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int order=1;
        boolean flag=true;

        while(!queue.isEmpty()){
            if(queue.peek()==order){
                queue.poll();
                order++;
            }else if(!stack.isEmpty()&&stack.peek()==order){
                stack.pop();
                order++;
            } else{
                stack.push(queue.poll());
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()==order){
                stack.pop();
                order++;
            }else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");


        br.close();

    }
}