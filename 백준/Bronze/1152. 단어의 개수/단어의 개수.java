import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str= sc.nextLine().trim();
        
        if(str.isEmpty()){
            System.out.println(0);
        }else{
        String[] arr= str.split(" ");
        System.out.println(arr.length);
            
        }
    }
}