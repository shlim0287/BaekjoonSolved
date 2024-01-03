import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); //입력값 받기
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*num-1)-(2*i);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<num-1;i++){
            for(int j=1;j<(num-1)-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<3+(2*i);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}