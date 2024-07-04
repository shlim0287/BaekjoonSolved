import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> q=new LinkedList<>();
        int a=Integer.parseInt(br.readLine());
        int last=0;
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            String s=st.nextToken();
            if(s.equals("push")){
                int num=Integer.parseInt(st.nextToken());
                last=num;
                q.add(num);
            }else if(s.equals("pop")){
                if(!q.isEmpty()){
                    System.out.println(q.peek());
                    q.poll();
                }else{
                    System.out.println(-1);
                }
            }else if(s.equals("size")){
                System.out.println(q.size());
            }else if(s.equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s.equals("front")){
                if(q.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(q.peek());
                }
            }else if(s.equals("back")){
                if(q.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(last);
                }
            }
        }
    }
}