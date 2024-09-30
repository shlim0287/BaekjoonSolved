class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb=new StringBuilder();
        String[] arr=my_string.split("");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(letter)){
                sb.append(arr[i]);
            }else{
                continue;
            }
        }
        return sb.toString();
    }
}