import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
        System.out.println(dfs(a,p));
        
        
    }
    public static int dfs(int a,int p){
        Map<Integer,Integer> m=new HashMap<>();
        int current=a;
        int length=0;
        while(!m.containsKey(current)){
            m.put(current,length);
            length++;
            current=nextNum(current,p);
        }
        return m.get(current);
    }
    public static int nextNum(int num,int p){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,p);
            num/=10;
        }
        return sum;
    }
}