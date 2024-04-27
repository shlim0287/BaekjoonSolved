import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int min=sc.nextInt();
        int ing=sc.nextInt();
        
        int mins=60*hour+min+ing;
        
        int hours=(mins/60)%24;
        int minss=(mins%60);
        System.out.printf("%d %d",hours,minss);
    }
}