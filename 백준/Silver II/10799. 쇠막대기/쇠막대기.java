import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Character> stack=new Stack<Character>();
        String input=sc.next();
        int result=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                stack.push('(');
            }else if(input.charAt(i)==')'){
                if(input.charAt(i-1)=='('){
                    stack.pop();
                    result+=stack.size();
                }else if(input.charAt(i-1)!='('){
                    result+=1;
                    stack.pop();
                }
            }
        }
        System.out.println(result);
    }
}