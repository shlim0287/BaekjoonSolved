import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //모두 같을 때
        if(a==b && b==c){
            System.out.println(10000+(a*1000));
        }
        //2개만
        else if(a==b||a==c){
            System.out.println(1000+(a*100));
        }
           
        else if(b==c){
            System.out.println(1000+(b*100));
        }
        //모두 다를 때
        else{
            int m=Math.max(a,Math.max(b,c));
            System.out.println(m*100);
        }
    }
}