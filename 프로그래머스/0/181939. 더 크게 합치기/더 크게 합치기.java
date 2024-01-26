class Solution {
    public int solution(int a, int b) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        
        sb.append(a1);
        sb.append(b1);
        int a2=Integer.parseInt(sb.toString());
        
        sb1.append(b1);
        sb1.append(a1);
        int b2=Integer.parseInt(sb1.toString());
        
        if(a2>=b2){
            return a2;
        }else{
            return b2;
        }
    }
}