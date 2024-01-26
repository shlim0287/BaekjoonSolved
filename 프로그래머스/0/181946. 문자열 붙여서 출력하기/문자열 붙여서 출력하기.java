import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        sb.append(a[0]);
        sb.append(a[1]);
        String answer=sb.toString();
        System.out.println(answer);
    }
}