import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.nextLine().toCharArray();
        int [] count=new int [26];
        
        
        for(int i=0;i<arr.length;i++){
            arr[i]=Character.toUpperCase(arr[i]);
            int idx= arr[i]-'A';
            count[idx]+=1;
        }
        
        int max=0;
        char  maxChar='?';
        boolean multiful=false;
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                 maxChar=(char)(i+'A');
                multiful=false;
            }else if(count[i]==max){
                multiful=true;
            }
        }
        
        if(multiful){
            System.out.println("?");
        }else{
            System.out.println(maxChar);
        }
        
        
        
    }
}