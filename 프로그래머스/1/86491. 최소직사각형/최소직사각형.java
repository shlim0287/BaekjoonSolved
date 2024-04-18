class Solution {
    public int solution(int[][] sizes) {
        int preMax=0;
        int preMin=0;

        for(int[] size:sizes){
            int max=Math.max(size[0],size[1]);
            int min=Math.min(size[0],size[1]);
            
            preMax=Math.max(max,preMax);
            preMin=Math.max(min,preMin);
            
        }
        return preMax*preMin;
    }
}