class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int repeat = commands.length;
        int[] answer = new int [repeat];
        
        for(int i=0;i<repeat;i++){
            int u = commands[i][0]-1;
            int t = commands[i][1];
            int k = commands[i][2]-1;
            
            //배열 슬라이스
            int[] slice= new int [t-u];
            for(int j=0;j<slice.length;j++){
                slice[j]=array[u+j];
            }
            
            sort(slice);
            
            answer[i]= slice[k]; //정답 추가
        }
        
        return answer;
    }
    
    private void sort(int[] slice){
        for(int i=0;i<slice.length-1;i++){
            for(int j=0;j<slice.length-i-1;j++){
                if(slice[j]>slice[j+1]){
                    int temp=slice[j];
                    slice[j]=slice[j+1];
                    slice[j+1]=temp;
                }
            }
        }
    }
}
