class Solution {
    public String solution(String s, int n) {
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                char moved=(char)((ch-'A'+n)%26 +'A');
                result.append(moved);
            }else if(Character.isLowerCase(ch)){
                char moved=(char)((ch-'a'+n)%26+'a');
                result.append(moved);
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}