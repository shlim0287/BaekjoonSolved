import java.util.*;
//한번 나온 값이 이후에 다시 나오면 그룹 단어 x-> 이전 단어여부 파악,
// 배열로 관리
//반복해야하므로 별도의 메서드로 관리
public class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(check()==true){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
    private static boolean check(){
        boolean[] arr=new boolean[26];
        int prev=0;
        String str=sc.next();
        
        for(int i=0;i<str.length();i++){
            int now = str.charAt(i);
            if(prev != now){// 틀리면?
                if(arr[now-'a']==false){
                    arr[now-'a']=true;
                    prev=now;
                }else{
                    return false;
                }
            }else{ //깉으면 지속
                continue;
            }
        }
        return true;
    }
    
    
}