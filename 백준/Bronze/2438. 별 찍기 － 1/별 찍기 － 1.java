import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            String s="*";
            sb.append(s.repeat(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}