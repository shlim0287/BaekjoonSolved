import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        int[]arr= new int [26];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                int idx=ch-'a';
                if(arr[idx]==-1){
                arr[idx]=i;                    
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}