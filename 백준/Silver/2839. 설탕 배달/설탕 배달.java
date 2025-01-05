import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        while(num>0){
            if(num%5==0){
                result+=num/5;
                break;
            }else{
                num-=3;
                result++;
            }
            if(num<0){
                result=-1;
            }
        }
        System.out.println(result);
    }
}