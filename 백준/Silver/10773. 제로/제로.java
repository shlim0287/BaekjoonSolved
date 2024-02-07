import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num;i++){
            int stNum=sc.nextInt();
            if(stNum==0){
                st.pop();
            }else{
                st.push(stNum);
            }
        }
        for(int a: st){
            sum+=a;
        }
        System.out.println(sum);
    }
}