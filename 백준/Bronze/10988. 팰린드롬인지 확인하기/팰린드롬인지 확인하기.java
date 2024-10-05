import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.nextLine().toCharArray();
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
           if(arr[start]!=arr[end]){
               System.out.println(0);
               return;
           }
           start++;
           end--;
        }

            System.out.println(1);
        
        
        
    }
}