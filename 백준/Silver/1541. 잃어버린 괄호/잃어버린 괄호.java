// - 값이 크면 결과가 최소
import java.util.*;
public class Main{
    static int answer=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ex=sc.nextLine();
        String[] str=ex.split("-");
        for(int i=0;i<str.length;i++){
            int temp=mySum(str[i]);
            if(i==0){
                answer+=temp;
            }else answer-=temp;
        }
        System.out.println(answer);
    }
    private static int mySum(String str){
        int sum=0;
        String[] arr=str.split("[+]");
        for(int i=0;i<arr.length;i++){
            sum+=Integer.parseInt(arr[i]);
        }
        return sum;
    }
}