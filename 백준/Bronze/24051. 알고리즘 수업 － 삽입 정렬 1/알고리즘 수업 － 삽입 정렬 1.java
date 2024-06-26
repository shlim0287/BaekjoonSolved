import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // 삽입 정렬 및 K번째 저장되는 수 찾기
        int result = findKthSave(N, K, A);
        
        // 결과 출력
        System.out.println(result);
    }

    public static int findKthSave(int N, int K, int[] A) {
        int saveCount = 0;

        for (int i = 1; i < N; i++) {
            int loc = i - 1;
            int newItem = A[i];

            // A[0..i-1] 부분은 이미 정렬된 상태
            while (loc >= 0 && newItem < A[loc]) {
                A[loc + 1] = A[loc];
                loc--;
                saveCount++;
                if (saveCount == K) {
                    return A[loc + 1];
                }
            }
            if (loc + 1 != i) {
                A[loc + 1] = newItem;
                saveCount++;
                if (saveCount == K) {
                    return newItem;
                }
            }
        }

        // 저장 횟수가 K보다 작으면 -1 리턴
        return -1;
    }
}
