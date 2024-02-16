import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int repeat=sc.nextInt();
        
        for(int i=0;i<repeat;i++){ 
            String input=sc.next();
            Stack<Character> stack=new Stack<Character>();
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='('){
                stack.push(input.charAt(j));
            }else{
                if(stack.size()==0){
                    stack.push(input.charAt(j));
                    break;
                }else{
                    stack.pop();
                }
            }
          }
            if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }

    }
}