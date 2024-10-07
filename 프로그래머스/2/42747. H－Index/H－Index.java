import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int h = n; h > 0; h--) {
            if (citations[n - h] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}