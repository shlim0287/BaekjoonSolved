import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        String m=Integer.toString(a*b*c);
        String[] arr=m.split("");
        int [] result=new int[10];
        for(int i=0;i<arr.length;i++){
           int n= Integer.parseInt(arr[i]);
            result[n]+=1;
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        
    }
}