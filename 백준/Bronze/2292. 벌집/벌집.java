import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        int count=1;
        int range=2;
        if(a==1){
            System.out.println(1);
        }else{
          while(range<=a){
            range=range+(count*6);
            count++;
        }
                    System.out.println(count);
        }
    }
}