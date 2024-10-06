import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean flag = true;

        while (flag) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                flag = false;
                continue; // 종료 조건에 맞으면 아래 코드 실행하지 않음
            }

            // 삼각형 유효성 검사
            int max = Math.max(a, Math.max(b, c));
            if (max >= (a + b + c - max)) {
                System.out.println("Invalid");
            } else {
                // 삼각형 종류 판단
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if ((a == b && b != c) || (a == c && c != b) || (b == c && a != b)) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
