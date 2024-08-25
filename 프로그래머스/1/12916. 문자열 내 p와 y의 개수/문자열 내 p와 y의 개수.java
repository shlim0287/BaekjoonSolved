class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr=s.split("");
        int pCount=0;
        int yCount=0;
        
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(str.equals("p")||str.equals("P")){
                pCount++;
            }
            if(str.equals("y")||str.equals("Y")){
                yCount++;
            }
        }
        if(pCount==yCount){
            return true;
        }else{
            return false;
        }
    }
}