import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        int run = sc.nextInt();
        
        int total=60*h+m;
        total+=run;
        
        int hour=(total/60)%24;
        int min=total%60;
        
        System.out.println(hour + " "+ min);
    }
}