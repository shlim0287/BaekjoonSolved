import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] dist = new long[n - 1];
		long[] cost = new long[n];
        
        for(int i=0;i<dist.length;i++){
            dist[i]=sc.nextLong();
        }
        
        for(int i=0;i<cost.length;i++){
            cost[i]=sc.nextLong();
        }
        
        long result=0;
        long movedCost=cost[0];
        for(int i=0;i<n-1;i++){
            if(cost[i]<movedCost){
                movedCost=cost[i];
            }
            
            result+=movedCost*dist[i];
            
        }
        System.out.println(result);
        
        
    }
}