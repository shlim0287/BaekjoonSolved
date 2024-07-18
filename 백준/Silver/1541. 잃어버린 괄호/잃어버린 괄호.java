import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stS=new StringTokenizer(br.readLine(),"-");
        int result=Integer.MAX_VALUE;
        while(stS.hasMoreTokens()){
            int temp=0;
            
            StringTokenizer stP=new StringTokenizer(stS.nextToken(),"+");
            
            while(stP.hasMoreTokens()){
                temp+=Integer.parseInt(stP.nextToken());
            }
            
           if(result ==Integer.MAX_VALUE){
               result=temp;
           }else{
               result-=temp;
           }
        }
        System.out.println(result);
    }
}