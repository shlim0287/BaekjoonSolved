import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][] arr=new char[5][15];
        // 행렬 세팅
        for(int i=0;i<5;i++){
            String line=br.readLine();
            for(int k=0;k<line.length();k++){
                arr[i][k]=line.charAt(k);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int k=0;k<15;k++){
            for(int i=0;i<5;i++){
                if(arr[i][k]!='\0'){
                    sb.append(arr[i][k]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}