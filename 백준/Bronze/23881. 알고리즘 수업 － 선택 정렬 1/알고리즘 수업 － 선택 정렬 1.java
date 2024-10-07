import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        boolean found = false;
        
        for (int last = n - 1; last > 0; last--) {
            int maxIndex = 0;
            for (int j = 1; j <= last; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            
            if (maxIndex != last) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[last];
                arr[last] = temp;
                count++;
                
                if (count == k) {
                    System.out.println(Math.min(arr[maxIndex], arr[last]) + " " + Math.max(arr[maxIndex], arr[last]));
                    found = true;
                    return;
                }
            }
        }
        
        if (!found) {
            System.out.println(-1);
        }
    }
}