import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        sc.close();
        
        int m=0;
        
        for(int i=1;i<=n;i++){
            int res=0;
            int num=i;
            while(num>0){
                res+=num%10;
                num/=10;
            }
            if(i+res==n){
                m=i;
                break;
            }
        }
        System.out.println(m);
    }
}