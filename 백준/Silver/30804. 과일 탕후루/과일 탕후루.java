import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }
        
        int maxLength = 0;
        int left = 0;
        Map<Integer, Integer> fruitCount = new HashMap<>();
        
        for (int right = 0; right < N; right++) {
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);
            
            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        System.out.println(maxLength);
    }
}
