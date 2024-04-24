import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int person=sc.nextInt();
        int [] arr=new int [person];
        //사람 정보 받기
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //작은 순서대로 정렬
        Arrays.sort(arr);
        //최소값 구하기
        int stack=0;
        int answer=0;
        for(int j=0;j<arr.length;j++){
            answer+=stack+arr[j];
            stack+=arr[j];
        }
        System.out.println(answer);
    }
}