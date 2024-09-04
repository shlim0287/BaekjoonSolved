class Solution {
    public long solution(int a, int b) {
        long result = 0;
        
        int start = 0; 
        int end = 0; 
        

        if (a > b) {
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }
        
        for (int i = start; i <= end; i++) {
            result += i;
        }
        
        return result; 
    }
}