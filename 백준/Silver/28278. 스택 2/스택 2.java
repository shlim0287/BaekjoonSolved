import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            String firstIndex = st.nextToken();
            if(firstIndex.equals("1"))stack.push(Integer.parseInt(st.nextToken()));
            else if(firstIndex.equals("2"))
            {
                if(!stack.isEmpty())
                {
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                }
                else sb.append(-1).append("\n");
            }
            else if(firstIndex.equals("3")) sb.append(stack.size()).append("\n");
            else if(firstIndex.equals("4"))
                if(stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            else if(firstIndex.equals("5"))
                if(stack.isEmpty())sb.append(-1).append("\n");
                else sb.append(stack.lastElement()).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}