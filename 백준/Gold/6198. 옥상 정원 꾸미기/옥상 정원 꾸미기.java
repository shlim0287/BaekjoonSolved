import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> st= new Stack<>();
        long sum=0;
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            int h=Integer.parseInt(br.readLine());
            
            while(!st.isEmpty()){
                if(st.peek()<=h){
                    st.pop();
                }else{
                    break;
                }
            }
            sum+=st.size();
            st.push(h);
        }
        System.out.println(sum);
    }
}