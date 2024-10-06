import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> xSet=new HashSet<>();
        Set<Integer> ySet=new HashSet<>();
        
        for(int i=0;i<3;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            
            if(xSet.contains(x)){
                xSet.remove(x);
            }else{
                xSet.add(x);
            }
            
           if(ySet.contains(y)){
                ySet.remove(y);
            }else{
                ySet.add(y);
            }
        }
        
        System.out.print(xSet.iterator().next()+" ");
        System.out.print(ySet.iterator().next());
            
            
        }
    }
