import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            System.out.println(first+""+last);
        }
        
    }
}