import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        Set<String> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(br.readLine());
        }
        String[] arr=new String[s.size()];
        s.toArray(arr);         
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String s1,String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length()-s2.length();
                }
            }
        });
        for(String k:arr){
            System.out.println(k);
        }
        
    }
}