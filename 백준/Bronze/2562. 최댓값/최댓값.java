import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        
        int []arr=new int [9];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int idx=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}