class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str=s.toUpperCase();
        int countP=0;
        int countY=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='P'){
                countP++;
            }else if(a=='Y'){
                countY++;
            }
        }
        if(countP==countY){
            return true;
        }else{
            return false;
        }
    }
}