import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt(),x,y,area=0;
        boolean [][]arr=new boolean[100][100];
        
        for(int i=0;i<nums;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            for(int a=x;a<x+10;a++){
                for(int b=y;b<y+10;b++){
                    if(!arr[b][a]){
                        arr[b][a]=true;
                        area++;
                    }
                    
                }
            }
            
        }
        System.out.println(area);
    }
}