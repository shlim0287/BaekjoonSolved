import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = c - 'A'; 
            if (idx < 3) { // A, B, C
                result += 3; 
            } else if (idx < 6) { // D, E, F
                result += 4; 
            } else if (idx < 9) { // G, H, I
                result += 5; 
            } else if (idx < 12) { // J, K, L
                result += 6; 
            } else if (idx < 15) { // M, N, O
                result += 7; 
            } else if (idx < 19) { // P, Q, R, S
                result += 8; 
            } else if (idx < 22) { // T, U, V
                result += 9; 
            } else { // W, X, Y, Z
                result += 10; 
            }
        }
        
        System.out.println(result);
    }
}
