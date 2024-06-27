import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int a=sc.nextInt();
        
        for(int i=1;i<=a;i++){
            sb.append(" ".repeat(a-i)).append("*".repeat(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}