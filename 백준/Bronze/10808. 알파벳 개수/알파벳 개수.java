import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int [26];
        
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            arr[c-97]++;
        }
        
        for(int i=0;i<26;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}