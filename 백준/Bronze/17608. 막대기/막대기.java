import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int repeat=Integer.parseInt(br.readLine());
        
        int count=1;
        
        Stack<Integer> st=new Stack();
        
        for(int i=0;i<repeat;i++){
            st.push(Integer.parseInt(br.readLine()));
        }
        
        int left=st.pop();
        
        int compare;
        
        while(!st.isEmpty()){
            compare=st.pop();
            if(compare>left){
                left=compare;
                count++;
            }
        }
        System.out.println(count);
        
        
        
    }
}